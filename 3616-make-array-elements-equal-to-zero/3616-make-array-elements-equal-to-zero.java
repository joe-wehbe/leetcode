class Solution {
    public int countValidSelections(int[] nums) {
        int[] prefix = new int[nums.length+1];
        int count = 0;
        int sum = 0;

        for (int i = 0; i < nums.length; i++) {
            prefix[i+1] = prefix[i] + nums[i];
            sum += nums[i];
        }

        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == 0) {
                int leftSum = prefix[i];
                int rightSum = sum - leftSum;

                if (leftSum == rightSum) count += 2;
                else if (leftSum == rightSum + 1) count += 1;
                else if (rightSum == leftSum + 1) count += 1;
            }
        }

        return count;
    }
}