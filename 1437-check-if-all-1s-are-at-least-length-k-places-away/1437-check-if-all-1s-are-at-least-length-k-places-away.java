class Solution {
    public boolean kLengthApart(int[] nums, int k) {
    
        int i = 0;
        while(i < nums.length && nums[i] == 0)
            i++;
        
        int count = 0;
        for(int j = i + 1; j < nums.length; j++){
            if(nums[j] == 0){
                count++;
            }
            
            if(nums[j] == 1){
                if(count < k){
                    return false;
                }
                else{
                    count = 0;
                }
            }
        }
        return true;
    }
}