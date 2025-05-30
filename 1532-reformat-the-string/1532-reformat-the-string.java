class Solution {
    public String reformat(String s) {
        ArrayList<Character> digits = new ArrayList<>();
        ArrayList<Character> letters = new ArrayList<>();

        for (int i = 0; i < s.length(); i++) {
            Character c = s.charAt(i);
            if (Character.isDigit(c)) digits.add(c);
            else letters.add(c);
        }

        int d = digits.size();
        int l = letters.size();

        if (Math.abs(d - l) > 1) return "";

        StringBuilder result = new StringBuilder();
        boolean digitFirst = d >= l;

        for (int i = 0; i < s.length(); i++) {
            if (digitFirst) {
                result.append(digits.remove(0));
            } else {
                result.append(letters.remove(0));
            }
            digitFirst = !digitFirst;
        }

        return result.toString();
    }
}