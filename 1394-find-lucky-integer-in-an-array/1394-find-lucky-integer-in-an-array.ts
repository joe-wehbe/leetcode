function findLucky(arr: number[]): number {
    
    let map: Map<number, number> = new Map();
    
    for(const num of arr) {
        map.has(num) ? map.set(num, map.get(num) + 1) : map.set(num, 1);
    }
    
    let maxLucky = -1;
    for(let [key, value] of map) {
        if(key == value) {
            if(key > maxLucky) {
                maxLucky = key;
            }
        }
    }
    return maxLucky;
};