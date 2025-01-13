class Solution {
    public int minimumLength(String s) {
        int n = s.length();

        if (n < 3) return n;

        int[] freq = new int[26];
        
        for (int i = 0; i < n; i++) {
            freq[s.charAt(i) - 'a']++;
        }

        int minLength = n;

        for (int i = 0; i < 26; i++) {
            int value = freq[i];
            
            while (value >= 3) {
                value -= 2;
                minLength -= 2;
            }
        }

        return minLength;
    }
}
