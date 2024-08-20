class Solution {
    public int[] sortArrayByParity(int[] nums) {
        
        int[] result = new int[nums.length];
        int first = 0;
        int last = nums.length - 1;
        
        for(int num : nums){
            if(num % 2 == 0){
                result[first] = num;
                first++;
            }
            else{
                result[last] = num;
                last--;
                
            }
        }
        return result;
    }
}