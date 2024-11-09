class Solution {
    public long minEnd(int n, int x) {
        long v = x;

        while (--n > 0) {
            v = (v + 1) | x;
        }

        return v;
    }
}