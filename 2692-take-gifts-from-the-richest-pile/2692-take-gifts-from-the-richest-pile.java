class Solution {
    public long pickGifts(int[] gifts, int k) {
        PriorityQueue<Long> maxHeap = new PriorityQueue<>(Collections.reverseOrder());

        for(int gift : gifts){
            maxHeap.offer((long) gift);
        }

        while (k > 0) {
            long max = maxHeap.poll();
            maxHeap.offer((long) Math.floor(Math.sqrt(max)));
            k--;
        }

        long numGifts = 0;
        while(!maxHeap.isEmpty()) {
            numGifts += maxHeap.poll();
        }

        return numGifts;
    }
}