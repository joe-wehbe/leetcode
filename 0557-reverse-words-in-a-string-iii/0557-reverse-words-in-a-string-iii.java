class Solution {
    public String reverseWords(String s) {
        String words[] = s.split(" ");

        for (int i = 0; i < words.length; i++) {
            words[i] = reverse(words[i]);
        }

        return String.join(" ", words);
    }

    private String reverse(String s) {
        StringBuilder sb = new StringBuilder(s);
        return sb.reverse().toString();
    }
}