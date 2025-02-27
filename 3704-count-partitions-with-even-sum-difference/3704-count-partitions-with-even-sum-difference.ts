function countPartitions(nums: number[]): number {
    let sum = 0;
    let left = 0;
    let right = 0;
    let result = 0;

    for (const num of nums) {
        sum += num;
        right += num;
    }

    for (let i = 0; i < nums.length - 1; i++) {
        left += nums[i];
        right -= nums[i];

        if (Math.abs(left - right) % 2 == 0) result++;
    }

    return result;
};