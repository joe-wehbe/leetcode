class Solution {
    public int searchInsert(int[] nums, int target) {
        
        int start = 0;
        int end = nums.length - 1;
        int middle = (start + end) / 2;
        
        while (start <= end){
            
            middle = (start + end) / 2;
            
            if(target == nums[middle]){
                return middle;
            }
            else{
                if(target > nums[middle]){
                    start = middle + 1;
                }
                if(target < nums[middle]){
                    end = middle - 1;
                }
            }
        }
        return start;
    }
}