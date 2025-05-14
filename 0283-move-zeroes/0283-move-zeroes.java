class Solution {
    public int[] moveZeroes(int[] nums) {
        if (nums.length == 1) return nums;
        
        int count = 0;
        int index = 0;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] != 0) nums[index++] = nums[i];
            else count++;
        }

        while (count-- > 0) {
            nums[nums.length - 1 - count] = 0;
        }

        return nums;
    }
}


