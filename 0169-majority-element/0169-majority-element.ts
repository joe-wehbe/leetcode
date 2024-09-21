function majorityElement(nums: number[]): number {

    let map = new Map<number, number>();

    for(let i = 0; i < nums.length; i++){
        map.has(nums[i]) ? map.set(nums[i], map.get(nums[i]) + 1) : map.set(nums[i], 1);
    }

    for (let [key, value] of map) {
        if (value > nums.length / 2) {
            return key;
        }
    }
    return -1;
};