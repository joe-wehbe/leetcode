class Solution {
    public boolean isValid(String word) {
        boolean vowel = false;
        boolean consonant = false;
        Set<Character> vowels = Set.of('a', 'e', 'i', 'o', 'u', 'A', 'E', 'I', 'O', 'U');

        if (word.length() < 3) return false;
        for (char c : word.toCharArray()) {
            if (!Character.isDigit(c) && !Character.isLetter(c)) return false;
            if (Character.isLetter(c)) {
                if (vowels.contains(c)) vowel = true;
                if (!vowels.contains(c)) consonant = true;
            }
        }

        return vowel && consonant;
    }
}