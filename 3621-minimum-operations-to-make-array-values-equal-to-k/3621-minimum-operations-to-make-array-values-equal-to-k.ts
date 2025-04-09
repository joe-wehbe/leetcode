function minOperations(nums: number[], k: number): number {
    let set: Set<number> = new Set();
    let count: number = 0;

    for (let i = 0; i < nums.length; i++) {
        if (nums[i] < k) return -1;
        if (!set.has(nums[i]) && nums[i] > k) {
            set.add(nums[i]);
            count++;
        }
    }

    return count;
};