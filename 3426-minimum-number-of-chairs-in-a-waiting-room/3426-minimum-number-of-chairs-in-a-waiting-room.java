class Solution {
    public int minimumChairs(String s) {
        int current = 0;
        int max = 0;

        for (char c : s.toCharArray()) {
            if (c == 'E') {
                current++;
                max = Math.max(max, current);
            } else if (c == 'L') {
                current--;
            }
        }

        return max;
    }
}