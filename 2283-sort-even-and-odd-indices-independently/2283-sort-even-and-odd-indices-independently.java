class Solution {
    public int[] sortEvenOdd(int[] nums) {
        int n = nums.length;
        int[] odd = new int[n/2];
        int[] even;

        if (n % 2 != 0) {
            even = new int[n/2+1];
            even[even.length-1] = nums[n-1];
        } else {
            even = new int[n/2];
        }

        int index = 0;
        for (int i = 0; i < n-1; i+=2) {
            even[index] = nums[i];
            odd[index++] = nums[i+1];
        }

        Arrays.sort(even);
        Arrays.sort(odd);
        
        int evenIndex = 0;
        int oddIndex = 0;
        for (int i = 0; i < nums.length; i++) {
            if (i % 2 == 0) {
                nums[i] = even[evenIndex++];
            } else {
                nums[i] = odd[odd.length - 1 - oddIndex++];
            }
        }

        return nums;
    }
}