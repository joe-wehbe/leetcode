function minOperations(nums: number[]): number {

    let operations = 0;

    for (let i = 1; i < nums.length; i++) {
        while (nums[i] <= nums[i-1]) {
            nums[i]++;
            operations++;
        }
    }

    return operations;
};