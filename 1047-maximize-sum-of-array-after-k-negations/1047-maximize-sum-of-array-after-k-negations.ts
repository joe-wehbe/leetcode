function largestSumAfterKNegations(nums: number[], k: number): number {
    while (k > 0) {
        let minIndex = nums.indexOf(Math.min(...nums));
        nums[minIndex] = -nums[minIndex];
        k--;
    }
    return nums.reduce((acc, curr) => acc + curr, 0);
};