class Solution {
    public List<Integer> findKDistantIndices(int[] nums, int key, int k) {
        Set<Integer> set = new HashSet<>();
        
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == key) {                
                for (int j = 0; j <= k; j++) {
                    if (i+j < nums.length) set.add(i+j);
                    if (i-j >= 0) set.add(i-j);
                }
            }
        }

        List<Integer> list = new ArrayList<>(set);
        Collections.sort(list);

        return list;
    }
}