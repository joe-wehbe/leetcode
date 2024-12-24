function applyOperations(nums: number[]): number[] {
    for(let i = 0; i < nums.length - 1; i++) {
        if(nums[i] == nums[i+1]) {
            nums[i] *= 2;
            nums[i+1] = 0;
        }
    }

    let count = 0;
    let result: number[] = [];

    for(const num of nums) {
        num === 0 ? count++ : result.push(num);
    }

    while (count > 0) {
        result.push(0);
        count--;
    }

    return result;
}