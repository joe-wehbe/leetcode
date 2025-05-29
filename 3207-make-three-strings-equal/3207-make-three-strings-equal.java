class Solution {
    public int findMinimumOperations(String s1, String s2, String s3) {
        int i = -1;
        int n = Math.min(s1.length(), s2.length());
        n = Math.min(n, s3.length());

        while ((i + 1 < n) && (s1.charAt(i+1) == s2.charAt(i+1) && s2.charAt(i+1) == s3.charAt(i+1))) i++;
        return i == -1 ? -1 : ((s1.length() - 1 - i) + (s2.length() - 1 - i) + (s3.length() - 1 - i));
    }
}