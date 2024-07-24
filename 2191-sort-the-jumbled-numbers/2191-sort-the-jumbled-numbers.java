class Solution {
    public static int[] sortJumbled(int[] mapping, int[] nums) {
        
        int[][] mappedNums = new int[nums.length][2];
        
        for (int i = 0; i < nums.length; i++) {
            mappedNums[i][0] = nums[i];
            mappedNums[i][1] = mapNumber(nums[i], mapping);
        }
        
        Arrays.sort(mappedNums, Comparator.comparingInt(a -> a[1]));
        
        for (int i = 0; i < nums.length; i++) {
            nums[i] = mappedNums[i][0];
        }
        
        return nums;
    }
    
    private static int mapNumber(int num, int[] mapping){
        
        String str = Integer.toString(num);
        StringBuilder sb = new StringBuilder();
        
        for(int i = 0; i < str.length(); i++) {
            sb.append(mapping[str.charAt(i) - '0']);
        }
            
        return Integer.parseInt(sb.toString());
    }
}