class Solution {
    public int maxProduct(int n) {
        int[] pair = new int[2];

        while (n > 0) {
            int num = n % 10;
            if (num >= pair[0]) {
                pair[1] = pair[0];
                pair[0] = num;
            }
            else {
                if (num > pair[1]) pair[1] = num;
            }
            n /= 10;
        }

        return pair[0] * pair[1];
    }
}