function repeatedNTimes(nums: number[]): number {
        
    let map:Map<number, number> = new Map();

    for(const num of nums) {
        map.has(num) ? map.set(num, map.get(num) + 1) : map.set(num, 1);
    }

    for(const [key, value] of map) {
        if(value == nums.length / 2) {
            return key;
        }
    }
    return -1;
}