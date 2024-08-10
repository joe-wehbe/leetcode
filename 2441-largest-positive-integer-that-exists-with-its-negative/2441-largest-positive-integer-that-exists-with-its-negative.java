class Solution {
    public int findMaxK(int[] nums) {
        
        Arrays.sort(nums);
        List<Integer> list = new ArrayList<Integer>();
            
        for(int num : nums){
            list.add(num);
        }
        
        for(int i = list.size() - 1; i >= 0; i--){
            if(list.contains(-list.get(i))){
                return list.get(i);
            }
        }
        return -1;
    }
}