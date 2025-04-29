class Solution {
    public int mostFrequent(int[] nums, int key) {
        Map<Integer, Integer> map = new HashMap<>();

        for (int i = 0; i < nums.length - 1; i++) {
            if (nums[i] == key) {
                map.put(nums[i+1], map.getOrDefault(nums[i+1], 0) + 1);
            }
        }

        int maxValue = 0;
        int result = 0;
        for (Map.Entry<Integer, Integer> entry:map.entrySet()) {
            int value = entry.getValue();
            int mapKey = entry.getKey();
            if (value > maxValue) {
                maxValue = value;
                result = mapKey;
            }
        }

        return result;
    }
}