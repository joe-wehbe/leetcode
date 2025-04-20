class Solution {
    public String largestGoodInteger(String num) {
        String[] digits = {"999", "888", "777", "666", "555", "444", "333", "222", "111", "000"};

        for (String digit : digits) {
            if (num.contains(digit)) return digit;
        }

        return "";
    }
}