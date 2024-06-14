class Solution {
    public int minIncrementForUnique(int[] nums) {
        int count = 0;
        
        Arrays.sort(nums);
        for(int i = 0; i < nums.length - 1; i++){
            if(nums[i+1] <= nums[i]){
                count += (nums[i] + 1) - nums[i+1];
                nums[i+1] = nums[i] + 1;
            }
        }
        return count;
    }
}