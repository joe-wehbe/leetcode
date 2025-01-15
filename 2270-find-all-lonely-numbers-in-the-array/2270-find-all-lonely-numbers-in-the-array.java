class Solution {
    public List<Integer> findLonely(int[] nums) {
        Map<Integer, Integer> map = new HashMap<>();
        List<Integer> result = new ArrayList<>();

        for (int num : nums) {
            map.put(num, map.getOrDefault(num, 0) + 1);
        }

        for (int num : nums) {
            if (map.get(num) == 1 && !map.containsKey(num + 1) && !map.containsKey(num - 1)) {
                result.add(num);
            }
        }

        return result;
    }
}