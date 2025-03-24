function maxAdjacentDistance(nums: number[]): number {
    let max = Math.abs(nums[0] - nums[nums.length - 1]);

    for (let i = 0; i < nums.length - 1; i++) {
        max = Math.max(max, Math.abs(nums[i] - nums[i+1]));
    }

    return max;
};