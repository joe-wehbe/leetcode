class Solution {
    public int findPermutationDifference(String s, String t) {
        Map<Character, Integer> tIndexMap = new HashMap<>();
        int totalDifference = 0;

        for (int i = 0; i < t.length(); i++) {
            tIndexMap.put(t.charAt(i), i);
        }

        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);
            int j = tIndexMap.get(ch);
            totalDifference += Math.abs(i - j);
        }

        return totalDifference;
    }
}