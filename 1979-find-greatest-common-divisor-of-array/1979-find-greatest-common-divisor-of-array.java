class Solution {
    public int findGCD(int[] nums) {
        
        int max = 0;
        int min = Integer.MAX_VALUE;
        
        for(int num : nums){
            if(num > max)
                max = num;

            if(num < min)
                min = num;
        }
        
        while(min > 0){
            int temp = min;
            min = max % temp;
            max = temp;
        }
        return max;
    }
}