function transformArray(nums: number[]): number[] {
    let even = 0;

    for (const num of nums) {
        if (num % 2 === 0) even++;
    }

    for (let i = 0; i < nums.length; i++) {
        even > 0 ? (nums[i] = 0, even--) : nums[i] = 1
    }

    return nums;
};