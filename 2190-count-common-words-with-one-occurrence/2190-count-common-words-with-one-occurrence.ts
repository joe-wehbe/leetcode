function countWords(words1: string[], words2: string[]): number {
    let map1: Map<string, number> = new Map();
    for(const word of words1) {
        map1.has(word) ? map1.set(word, map1.get(word) + 1) : map1.set(word, 1);
    }

    let map2: Map<string, number> = new Map();
    for(const word of words2) {
        map2.has(word) ? map2.set(word, map2.get(word) + 1) : map2.set(word, 1);
    }
    
    let count = 0;
    for(const [key, value] of map1) {
        if(value === 1 && map2.has(key) && map2.get(key) === 1) count++;
    }

    return count;
};