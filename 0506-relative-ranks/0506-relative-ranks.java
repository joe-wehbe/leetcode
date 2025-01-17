class Solution {
    public String[] findRelativeRanks(int[] score) {
        Map<Integer, Integer> map = new HashMap<>();
        PriorityQueue<Integer> maxHeap = new PriorityQueue<>((a, b) -> b - a);
        String[] answer = new String[score.length];

        for (int i = 0; i < score.length; i++) {
            map.put(score[i], i);
            maxHeap.offer(score[i]);
        }

        int count = 1;

        while (!maxHeap.isEmpty()) {
            if (count == 1) {
                answer[map.get(maxHeap.poll())] = "Gold Medal";
            }

            else if (count == 2) {
                answer[map.get(maxHeap.poll())] = "Silver Medal";
            }

            else if (count == 3) {
                answer[map.get(maxHeap.poll())] = "Bronze Medal";
            }

            else {
                answer[map.get(maxHeap.poll())] = Integer.toString(count);
            }

            count++;
        }

        return answer;
    }
}