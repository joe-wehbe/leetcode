class Solution {
    public String toGoatLatin(String sentence) {
        String[] words = sentence.split(" ");
        Set<Character> set = Set.of('a', 'e', 'i', 'o', 'u', 'A', 'E', 'I', 'O', 'U');

        for (int i = 0; i < words.length; i++) {
            words[i] = goatLatin(words[i], set, i+1);
        }

        return String.join(" ", words);
    }

    private String goatLatin(String word, Set<Character> set, int index) {
        StringBuilder sb = new StringBuilder();

        if (set.contains(word.charAt(0))) {
            sb.append(word);
        }
        else {
            sb.append(word.substring(1));
            sb.append(word.charAt(0));
        }

        sb.append("ma");
        while (index-- > 0) sb.append("a");
        return sb.toString();
    }
}