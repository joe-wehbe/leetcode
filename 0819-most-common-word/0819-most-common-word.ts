function mostCommonWord(paragraph: string, banned: string[]): string {
    
    const words = paragraph.toLowerCase().split(/[ !?'.,;]+/);
    let map: Map<string, number> = new Map();
    let set = new Set(banned);
    
    for(const word of words) {
        if(!set.has(word) && word !== ''){
            map.has(word) ? map.set(word, map.get(word) + 1) : map.set(word, 1);           
        }
    }
    
    let maxValue = 0;
    let maxKey = '';
    
    for(let [key, value] of map) {
        if(value > maxValue) {
            maxValue = value;
            maxKey = key;
        }
    }
    
    return maxKey;
};