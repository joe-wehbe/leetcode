function countHillValley(nums: number[]): number {
    let count = 0;
    let prev = nums[0];

    for (let i = 1; i < nums.length - 1; i++) {
        if (nums[i] === nums[i+1]) continue;
        else if (nums[i] > prev && nums[i] > nums[i+1]) count++;
        else if (nums[i] < prev && nums[i] < nums[i+1]) count++;
        prev = nums[i];
    }

    return count;
};