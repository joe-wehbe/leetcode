class Solution {
    public int maxPower(String s) {
        int power = 1;
        int maxPower = 1;

        for (int i = 0; i < s.length()-1; i++) {
            if (s.charAt(i) == s.charAt(i+1)) {
                power++;
                if (power > maxPower) maxPower = power;
            } else {
                power = 1;
            }
        }

        return maxPower;
    }
}