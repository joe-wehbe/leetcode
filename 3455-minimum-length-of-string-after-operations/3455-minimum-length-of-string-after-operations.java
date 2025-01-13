class Solution {
    public int minimumLength(String s) {
        int n = s.length();

        if (n < 3) return n;

        Map<Character, Integer> map = new HashMap<>();
        for (int i = 0; i < n; i++) {
            char c = s.charAt(i);
            map.put(c, map.getOrDefault(c, 0) + 1);
        }

        int minLength = n;

        for (Map.Entry<Character, Integer> entry : map.entrySet()) {
            int value = entry.getValue();

            while (value >= 3) {
                value -= 2;
                minLength -= 2;
            }
        }

        return minLength;
    }
}