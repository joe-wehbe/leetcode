class Solution {
    public boolean areNumbersAscending(String s) {
        String[] words = s.split(" ");
        int lastDigit = -1;

        for (String word : words) {
            if (word.matches("\\d+")) {
                int digit = Integer.parseInt(word);

                if (digit > lastDigit) {
                    lastDigit = digit;
                } else {
                    return false;
                }
            }
        }

        return true;
    }
}