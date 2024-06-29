class Solution {
    public int[] shuffle(int[] nums, int n) {
        int[] array = new int[2*n];
        int i = 0;
        int j = n;
        int k = 0;
        
        while(j < nums.length){
            array[k] = nums[i];
            array[k + 1] = nums[j];
            i++;
            j++;
            k += 2;
        }
        return array;
    }
}