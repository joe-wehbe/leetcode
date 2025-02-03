function longestMonotonicSubarray(nums: number[]): number {
    let maxIncreasing = 1;
    let maxDecreasing = 1;
    let increasing = 1;
    let decreasing = 1;

    for (let i = 0; i < nums.length - 1; i++) {
        if (nums[i] < nums[i+1]) {
            increasing++;
        }
        else {
            maxIncreasing = Math.max(increasing, maxIncreasing);
            increasing = 1;
        }

        if (nums[i] > nums[i+1]) {
            decreasing++;
        }
        else {
            maxDecreasing = Math.max(decreasing, maxDecreasing);
            decreasing = 1;
        }
    }

    maxIncreasing = Math.max(increasing, maxIncreasing);
    maxDecreasing = Math.max(decreasing, maxDecreasing);

    return maxIncreasing > maxDecreasing? maxIncreasing : maxDecreasing;
};