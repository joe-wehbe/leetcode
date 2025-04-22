class Solution {
    public String replaceDigits(String s) {
        StringBuilder sb = new StringBuilder();
        int n = s.length();

        for (int i = 0; i < n - 1; i += 2) {
            sb.append(s.charAt(i));
            sb.append(shift(s.charAt(i), s.charAt(i+1)));
        }     

        if (n % 2 != 0) {
            sb.append(s.charAt(n - 1));
        }

        return sb.toString();
    }

    public char shift(char s, char digit) {
        return (char) (((int) s) + (digit - '0'));
    }
}