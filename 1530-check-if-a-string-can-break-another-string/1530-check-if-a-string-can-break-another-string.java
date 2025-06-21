class Solution {
    public boolean checkIfCanBreak(String s1, String s2) {
        char[] chars1 = s1.toCharArray();
        char[] chars2 = s2.toCharArray();

        Arrays.sort(chars1);
        Arrays.sort(chars2);

        return canBreak(chars1, chars2) || canBreak(chars2, chars1);
    }

    private boolean canBreak(char[] a, char[] b) {
        for (int i = 0; i < a.length; i++) 
            if (a[i] < b[i]) return false;

        return true;
    }
}