public class Solution {
    public boolean isSameAfterReversals(int num) {
        return reverse(reverse(num)) == num;
    }

    private int reverse(int num) {
        int reversed = 0;
        while (num > 0) {
            reversed = reversed * 10 + num % 10;
            num /= 10;
        }
        return reversed;
    }
}
