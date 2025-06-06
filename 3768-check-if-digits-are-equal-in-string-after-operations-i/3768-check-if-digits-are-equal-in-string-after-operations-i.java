class Solution {
    public boolean hasSameDigits(String s) {
        List<Integer> digits = new ArrayList<>();
        for (char c : s.toCharArray()) {
            digits.add(c - '0');
        }

        while (digits.size() > 2) {
            List<Integer> newDigits = new ArrayList<>();
            for (int i = 0; i < digits.size() - 1; i++) {
                int sum = (digits.get(i) + digits.get(i + 1)) % 10;
                newDigits.add(sum);
            }
            digits = newDigits;
        }

        return digits.get(0).equals(digits.get(1));
    }
}