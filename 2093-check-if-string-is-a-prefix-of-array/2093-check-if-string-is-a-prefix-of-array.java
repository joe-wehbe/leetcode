class Solution {
    public boolean isPrefixString(String s, String[] words) {
        StringBuilder sb = new StringBuilder();

        for (String word : words) {
            sb.append(word);
            if (sb.length() > s.length()) return false;
            if (sb.toString().equals(s)) return true;
        }

        return false;
    }
}