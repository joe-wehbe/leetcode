class Solution {
    public int differenceOfSum(int[] nums) {
        
        int elementSum = 0;
        int digitSum = 0;
        
        for(int num : nums){
            elementSum += num;
            
            if(num < 10){
                digitSum += num;
            }
            else{
                while(num != 0){
                    digitSum += num % 10;
                    num /= 10;
                }
            }     
        }
        return Math.abs(elementSum - digitSum);
    }
}