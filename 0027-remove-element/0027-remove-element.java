class Solution {
    public static int removeElement(int[] nums, int val) {
        
        int index = nums.length - 1;
        int count = 0;
        
        for(int i = 0; i < nums.length; i++){
            if(nums[i] == val){
                nums[i] = nums[index];
                nums[index] = -1;
                index--;
                count++;
                i--;
            }
        }
        return nums.length - count;
    }
}