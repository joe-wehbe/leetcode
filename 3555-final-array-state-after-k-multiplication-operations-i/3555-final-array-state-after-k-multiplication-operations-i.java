class Solution {
    public int[] getFinalState(int[] nums, int k, int multiplier) {
        PriorityQueue<int[]> minHeap = new PriorityQueue<>(
            (a, b) -> {
                return a[0] != b[0] ? Integer.compare(a[0], b[0]) : Integer.compare(a[1], b[1]);
            }
        );

        for(int i = 0; i < nums.length; i++) {
            minHeap.offer(new int[]{nums[i], i});
        }

        while(k > 0) {
            int[] element = minHeap.poll();
            nums[element[1]] *=  multiplier;
            minHeap.offer(new int[]{nums[element[1]], element[1]});
            k--;
        }

        return nums;
    }
}