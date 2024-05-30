class Solution {
    public int[] leftRightDifference(int[] nums) {
        int answer[] = new int[nums.length];
        int leftSum[] = new int[nums.length];
        int rightSum[] = new int[nums.length];
        leftSum[0] = 0;
        rightSum[nums.length - 1] = 0;
        
        int sum = 0;
        for(int i = 1; i < nums.length; i++){
            sum += nums[i -1];
            leftSum[i] = sum;
        }
        
        sum = 0;
        for(int i = nums.length - 2; i >= 0; i--){
            sum += nums[i+1];
            rightSum[i] = sum;
        }
        
        for(int i = 0; i < nums.length; i++){
            answer[i] = Math.abs(leftSum[i] - rightSum[i]);
        }
        return answer;
    }
}


