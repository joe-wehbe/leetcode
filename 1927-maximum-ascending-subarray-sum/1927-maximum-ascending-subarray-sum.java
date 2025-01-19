class Solution {
    public int maxAscendingSum(int[] nums) {
        int maxSum = nums[0];
        int sum = nums[0];

        for (int i = 0; i < nums.length - 1; i++) {
            if (nums[i] < nums[i + 1]) {
                sum += nums[i+1];
            }
            else {
                sum = nums[i+1];
            }
            maxSum = Math.max(maxSum, sum);
        }
        return maxSum;
    }
}