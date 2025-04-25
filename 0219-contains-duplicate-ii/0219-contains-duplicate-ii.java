class Solution {
    public boolean containsNearbyDuplicate(int[] nums, int k) {
        Map<Integer, ArrayList<Integer>> map = new HashMap<>();

        for (int i = 0; i < nums.length; i++) {
            if (map.containsKey(nums[i])) {
                map.get(nums[i]).add(i);
            } else {
                ArrayList list = new ArrayList();
                list.add(i);
                map.put(nums[i], list);
            }
        }

        for (Map.Entry<Integer, ArrayList<Integer>> entry:map.entrySet()) {
            ArrayList<Integer> list = entry.getValue();

            if (list.size() > 1) {
                for (int i = 0; i < list.size() - 1; i++) {
                    if (Math.abs(list.get(i) - list.get(i+1)) <= k) return true; 
                }
            }
        }

        return false;
    }
}