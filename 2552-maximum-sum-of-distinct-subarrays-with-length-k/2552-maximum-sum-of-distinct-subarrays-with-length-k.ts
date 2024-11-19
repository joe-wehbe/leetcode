function maximumSubarraySum(nums: number[], k: number): number {
    let maxSum = 0;
    let currentSum = 0;
    let set: Set<number> = new Set();

    let start = 0;
    for (let end = 0; end < nums.length; end++) {
        if (!set.has(nums[end])) {
            set.add(nums[end]);
            currentSum += nums[end];
        } else {
            while (set.has(nums[end])) {
                set.delete(nums[start]);
                currentSum -= nums[start];
                start++;
            }
            set.add(nums[end]);
            currentSum += nums[end];
        }

        if (end - start + 1 > k) {
            set.delete(nums[start]);
            currentSum -= nums[start];
            start++;
        }

        if (end - start + 1 == k) {
            maxSum = Math.max(maxSum, currentSum);
        }
    }
    return maxSum;
}