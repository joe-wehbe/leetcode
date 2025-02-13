class Solution {
    public int minOperations(int[] nums, int k) {
        PriorityQueue<Long> minHeap = new PriorityQueue<>();
        for (long num : nums) {
            minHeap.offer(num);
        } 

        int operations = 0;
        while (minHeap.size() > 1 && minHeap.peek() < k) {
            long x = minHeap.poll();
            long y = minHeap.poll();
            minHeap.offer(Math.min(x, y) * 2 + Math.max(x, y));
            operations++;
        }

        return operations;
    }
}