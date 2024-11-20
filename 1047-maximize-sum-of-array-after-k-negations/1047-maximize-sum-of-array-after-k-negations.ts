function largestSumAfterKNegations(nums: number[], k: number): number {
    nums.sort((a, b) => a - b);

    while (k > 0) {
        nums[0] = -nums[0];
        nums.sort((a, b) => a - b);
        k--;
    }
    return nums.reduce((acc, curr) => acc + curr, 0);
};