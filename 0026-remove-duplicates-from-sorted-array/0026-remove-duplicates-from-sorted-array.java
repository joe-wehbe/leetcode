class Solution {
    public static int removeDuplicates(int[] nums) {
        
        int count = 0;

        for(int i = 0; i < nums.length - 1; i++){
            if(nums[i] == nums[i+1]){
                nums[i] = -101;
                count++;
            }
        }
        
        for(int i = 0; i < nums.length; i++){
            int x = i;
            if(nums[i] == -101){
                while(nums[i] == -101 && i < nums.length - 1){
                    i++;
                }
                nums[x] = nums[i];
                nums[i] = -101;
                i = x;
            }
        }
        return nums.length - count;
    }
}