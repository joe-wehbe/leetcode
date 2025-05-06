class Solution {
    public int[] relativeSortArray(int[] arr1, int[] arr2) {
        Map<Integer, Integer> map = new TreeMap<>();
        int[] result = new int[arr1.length];
        int index = 0;

        for (int num : arr1) {
            map.put(num, map.getOrDefault(num, 0) + 1);
        }

        for (int num : arr2) {
            if (map.containsKey(num)) {
                int count = map.get(num);
                while (count-- > 0) {
                    result[index++] = num;
                }
                map.remove(num);
            }
        }

        for (Map.Entry<Integer, Integer> entry:map.entrySet()) {
            int key = entry.getKey();
            int count = entry.getValue();
            while (count-- > 0) {
                result[index++] = key;
            }
        }

        return result;
    }
}