class Solution {
    public int findLucky(int[] arr) {
        Map<Integer, Integer> map = new HashMap<>();
        int max = -1;

        for (int num : arr) {
            map.put(num, map.getOrDefault(num, 0) + 1);
        }

        for (Map.Entry<Integer, Integer> entry:map.entrySet()) {
            if (entry.getKey() == entry.getValue()) {
                max = Math.max(max, entry.getKey());
            }
        }

        return max;
    }
}