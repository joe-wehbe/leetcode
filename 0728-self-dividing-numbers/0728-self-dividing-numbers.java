class Solution {
    public List<Integer> selfDividingNumbers(int left, int right) {
        List<Integer> list = new ArrayList<>();

        for (int i = left; i <= right; i++) {
            if (selfDividing(i)) list.add(i);
        }

        return list;
    }

    private boolean selfDividing(int num) {
        int n = num;
        while(n > 0) {
            if (n % 10 == 0 || num % (n % 10) != 0) return false;
            n /= 10;
        }
        return true;
    }
}