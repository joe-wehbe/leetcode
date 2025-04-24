class Solution {
    public int[] findXSum(int[] nums, int k, int x) {
        int n = nums.length;
        int[] result = new int[n - k + 1];
        int index = 0;
        int i = 0;
        int j = k - 1;

        while (j < n) {
            Map<Integer, Integer> map = new HashMap<>();
            int[] subarray = Arrays.copyOfRange(nums, i, j+1);

            for (int num : subarray) {
                map.put(num, map.getOrDefault(num, 0) + 1);
            }

            PriorityQueue<Map.Entry<Integer, Integer>> maxHeap = new PriorityQueue<>(
                (a, b) -> {                
                    if (a.getValue() != b.getValue()) {
                        return b.getValue() - a.getValue();
                    } 
                    else {
                        return b.getKey() - a.getKey();
                    }
                }
            );
            maxHeap.addAll(map.entrySet());

            int count = x;
            while (!maxHeap.isEmpty() && count > 0) {
                Map.Entry<Integer, Integer> entry = maxHeap.poll();
                int key = entry.getKey();
                int value = entry.getValue();

                while (value > 0) {
                    result[index] += key;
                    value--;
                }
                count--;
            }
            index++;
            j++;
            i++;
        }

        return result;
    }
}