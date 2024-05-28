class Solution {
    public boolean isArraySpecial(int[] nums) {
        
        boolean isSpecial = true;
        for(int i = 0; i < nums.length - 1; i++){
            if(nums[i] % 2 != nums[i+1] % 2){
                continue;
            }
            
            if((nums[i] % 2 == 0 && nums[i+1] % 2 == 0) || (nums[i] % 2 != 0 && nums[i+1] % 2 != 0)){
                isSpecial = false;
            }
        }
        return isSpecial;
    }
}