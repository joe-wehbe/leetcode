public class Solution {
    public long maxKelements(int[] nums, int k) {
        PriorityQueue<Long> maxHeap = new PriorityQueue<>(Collections.reverseOrder());
        
        for (int num : nums) {
            maxHeap.add((long) num);
        }

        long score = 0;
        
        while (k > 0 && !maxHeap.isEmpty()) {
            long maxVal = maxHeap.poll();
            score += maxVal;
            maxHeap.add((long) Math.ceil(maxVal / 3.0));
            k--;
        }
        
        return score;
    }
}