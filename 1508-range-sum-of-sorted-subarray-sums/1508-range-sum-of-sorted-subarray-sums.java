class Solution {
    public static int rangeSum(int[] nums, int n, int left, int right) {
        
        int[] array = new int[n * (n + 1) / 2];
        
        int sum = 0;
        int index = 0;
        for(int i = 0; i < nums.length; i++){
            sum = 0;
            for(int j = i; j < nums.length; j++){
                sum += nums[j];
                array[index] = sum;
                index++;
            }
        }

        Arrays.sort(array);

        sum = 0;
        for(int i = left - 1; i < right; i++){
            sum = (sum + array[i]) % 1_000_000_007; 
        }

        return sum;
    }
}
