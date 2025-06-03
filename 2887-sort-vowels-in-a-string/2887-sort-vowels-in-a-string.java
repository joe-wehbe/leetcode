class Solution {
    public String sortVowels(String s) {
        Set<Character> set = Set.of('A', 'O', 'E', 'U', 'I', 'a', 'o', 'e', 'u', 'i');
        PriorityQueue<Integer> maxHeap = new PriorityQueue<>();
        StringBuilder result = new StringBuilder();
        int n = s.length();

        for (int i = 0; i < n; i++) {
            if (set.contains(s.charAt(i))) {
                maxHeap.offer((int) s.charAt(i));
            }
        }

        for (int i = 0; i < n; i++) {
            if (set.contains(s.charAt(i))) {
                result.append((char)(int) maxHeap.poll());
            } else {
                result.append(s.charAt(i));
            }
        }

        return result.toString();
    }
}