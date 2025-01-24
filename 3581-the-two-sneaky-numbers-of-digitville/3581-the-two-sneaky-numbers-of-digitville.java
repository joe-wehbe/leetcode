class Solution {
    public int[] getSneakyNumbers(int[] nums) {
        int[] occ = new int[nums.length - 2];
        int[] result = new int[2];
        int index = 0;

        for (int i = 0; i < nums.length; i++) {
            occ[nums[i]]++;

            if(occ[nums[i]] == 2) {
                result[index] = nums[i];
                index++;
            }
        }

        return result;
    }
}