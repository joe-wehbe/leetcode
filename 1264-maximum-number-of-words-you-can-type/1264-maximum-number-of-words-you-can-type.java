class Solution {
    public int canBeTypedWords(String text, String brokenLetters) {
        Set<Character> set = new HashSet<>();
        String[] words = text.split(" ");
        int count = 0;

        for (int i = 0; i < brokenLetters.length(); i++) {
            set.add(brokenLetters.charAt(i));
        }

        for (String word : words) {
            if (canBeTyped(word, set)) count++;
        }

        return count;
    }

    private boolean canBeTyped(String word, Set<Character> set) {
        for (int i = 0; i < word.length(); i++) {
            if (set.contains(word.charAt(i))) return false;
        }

        return true;
    }
}