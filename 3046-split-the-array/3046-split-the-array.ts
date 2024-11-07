function isPossibleToSplit(nums: number[]): boolean {
    
    let map: Map<number, number> = new Map();
    
    for(const num of nums) {
        map.has(num)? map.set(num, map.get(num) + 1) : map.set(num, 1);
    }
    
    for(let [key, value] of map) {
        if(value > 2) return false;
    }
    
    return true;
}
