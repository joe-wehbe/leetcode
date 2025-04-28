class Solution {
    public int vowelStrings(String[] words, int left, int right) {
        Set<Character> set = new HashSet<>(Arrays.asList('a', 'o', 'e', 'u', 'i'));
        int count = 0;

        for (int i = left; i <= right; i++) {
            if (set.contains(words[i].charAt(0)) && set.contains(words[i].charAt(words[i].length()-1))) count++;
        }

        return count;
    }
}