class Solution {
    public char kthCharacter(int k) {
        StringBuilder sb = new StringBuilder("a");
        while (sb.length() < k) generate(sb);
        return sb.toString().charAt(k-1);
    }

    private void generate(StringBuilder sb) {
        String str = sb.toString();
        for (int i = 0; i < str.length(); i++) {
            sb.append((char) (str.charAt(i) + 1));
        }
    }
}