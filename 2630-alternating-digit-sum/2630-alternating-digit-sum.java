class Solution {
    public int alternateDigitSum(int n) {
        int count = 0;
        int num = n;
        while (num > 0) {
            num /= 10;
            count++;
        }

        int result = 0;
        boolean add = count % 2 == 0 ? false : true;
        while (n > 0) {
           if (add) result += n % 10;
           else result -= n % 10;
           add = !add;
           n /= 10;
        }

        return result;
    }
}