class Solution {
    public int countEven(int num) {
        int count = 0;
        for (int i = 2; i <= num; i++) {
            if (sum(i) % 2 == 0) count++;
        }
        return count;
    }

    private int sum(int num) {
        int sum = 0;
        while (num > 0) {
            sum += num % 10;
            num /= 10;
        }
        return sum;
    }
}