class Solution {
    public static int[] numberGame(int[] nums) {
        for(int i = 0; i < nums.length - 1; i++){
            for(int j = i + 1; j < nums.length; j++){
                if(nums[j] < nums[i]) {
                    int temp = nums[j];
                    nums[j] = nums[i];
                    nums[i] = temp;
                }
            }
        }
        
        int i = 0;
        int[] arr = new int[nums.length];
        while(i < arr.length){
            arr[i] = nums[i+1];
            arr[i+1] = nums[i];
            i = i+2;
        }
        return arr;
    }
}