class Solution {
    public int minOperations(int[] nums, int k) {
        Arrays.sort(nums);
        int i = 0;

        while (nums[i] < k) {
            i++;
        }

        return i;
    }
}