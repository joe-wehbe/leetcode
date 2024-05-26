class Solution {
    public int[] buildArray(int[] nums) {
        int[] built = new int[nums.length];
        for(int i = 0; i < nums.length; i++){
            built[i] = nums[nums[i]];
        }
        return built;
    }
}