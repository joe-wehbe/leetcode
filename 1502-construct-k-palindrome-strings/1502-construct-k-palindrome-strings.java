class Solution {
    public boolean canConstruct(String s, int k) {
        if (s.length() < k) return false;

        Map<Character, Integer> map = new HashMap<>();
        for (int i = 0; i < s.length(); i++) {
            map.put(s.charAt(i), map.getOrDefault(s.charAt(i), 0) + 1);
        }

        int count = 0;
        for (Map.Entry<Character, Integer> entry: map.entrySet()) {
            if (entry.getValue() % 2 != 0) {
                count++;
            }
        }

        return count <= k;
    }
}