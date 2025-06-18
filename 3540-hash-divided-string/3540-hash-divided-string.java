class Solution {
    public String stringHash(String s, int k) {
        StringBuilder result = new StringBuilder();
        int count = 0;
        int values = 0;

        for (int i = 0; i < s.length(); i++) {
            count++;
            values += (int) s.charAt(i) - 97;

            if (count == k) {
                int hashedChar = values % 26;
                result.append((char) (hashedChar + 97));
                count = 0;
                values = 0;
            }
        }

        return result.toString();
    }
}