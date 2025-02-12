class Solution {
    public int maximumSum(int[] nums) {
        Map<Integer, PriorityQueue<Integer>> map = new HashMap<>();

        for (int num : nums) {
            int sum = digitsSum(num);
            
            if (map.containsKey(sum)) {
                map.get(sum).offer(num);
            }
            else {
                map.put(sum, new PriorityQueue<>(Collections.reverseOrder()));
                map.get(sum).offer(num);
            }
        }

        int result = -1;
        for (Map.Entry<Integer, PriorityQueue<Integer>> entry : map.entrySet()) {
            if (entry.getValue().size() >= 2) {
                int max = entry.getValue().poll() + entry.getValue().poll();
                result = Math.max(result, max);
            }
        }

        return result;
    }

    private int digitsSum(int num) {
        int sum = 0;
        while (num > 0) {
            sum += num % 10;
            num /= 10;
        }
        return sum;
    }
}