class Solution {
    public static int minDifference(int[] nums) {
        
        if (nums.length <= 4) {
            return 0;
        }

        Arrays.sort(nums);
        int num1 = nums[nums.length - 1] - nums[3];
        int num2 = nums[nums.length - 2] - nums[2];
        int num3 = nums[nums.length - 3] - nums[1];
        int num4 = nums[nums.length - 4] - nums[0];

        return Math.min(Math.min(num1, num2), Math.min(num3, num4));
    }
    
}