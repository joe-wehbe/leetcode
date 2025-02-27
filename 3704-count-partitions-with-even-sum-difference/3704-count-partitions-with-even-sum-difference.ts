function countPartitions(nums: number[]): number {
    let left = 0, right = nums.reduce((sum, num) => sum += num, 0)
    let result = 0;

    for (let i = 0; i < nums.length - 1; i++) {
        left += nums[i];
        right -= nums[i];

        if ((left - right) % 2 == 0) result++;
    }

    return result;
};