class Solution {
    public List<String> topKFrequent(String[] words, int k) {
        Map<String, Integer> map = new HashMap<>();
        for (String word : words) {
            map.put(word, map.getOrDefault(word, 0) + 1);
        }

        Queue<String> maxHeap = new PriorityQueue<>((a, b) -> {
            if (map.get(a) == map.get(b)) {
                return a.compareTo(b);
            }
            return map.get(b) - map.get(a);
        });

        for (String word : map.keySet()) {
            maxHeap.offer(word);
        }

        List<String> list = new ArrayList<>();
        while (k > 0) {
            list.add(maxHeap.poll());
            k--;
        }

        return list;
    }
}