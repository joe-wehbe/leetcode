class Solution {
    public long findTheArrayConcVal(int[] nums) {
        int i = 0;
        int j = nums.length-1;
        long result = 0;

        while (i < j) {
            result += Integer.parseInt(Integer.toString(nums[i]) + Integer.toString(nums[j]));
            i++;
            j--;
        }

        if (nums.length % 2 != 0) result += nums[nums.length/2];
        return result;
    }
}
