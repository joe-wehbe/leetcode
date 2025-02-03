function longestMonotonicSubarray(nums: number[]): number {
    if (nums.length === 0) return 0;

    let increasing = 1, decreasing = 1, max = 1;

    for (let i = 1; i < nums.length; i++) {
        if (nums[i] > nums[i - 1]) {
            increasing++;
            decreasing = 1;
        } else if (nums[i] < nums[i - 1]) {
            decreasing++;
            increasing = 1;
        } else {
            increasing = 1;
            decreasing = 1;
        }

        max = Math.max(max, increasing, decreasing);
    }

    return max;
}
