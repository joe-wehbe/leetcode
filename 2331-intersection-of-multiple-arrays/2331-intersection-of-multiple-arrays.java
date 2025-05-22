class Solution {
    public List<Integer> intersection(int[][] nums) {
        Map<Integer, Integer> map = new HashMap<>();
        List<Integer> list = new ArrayList<>();

        for (int[] num : nums) {
            for (int i = 0; i < num.length; i++) {
                map.put(num[i], map.getOrDefault(num[i], 0) + 1);
            }
        }

        for (Map.Entry<Integer, Integer> entry:map.entrySet()) {
            if (entry.getValue() == nums.length) list.add(entry.getKey());
        }

        Collections.sort(list);
        return list;
    }
}