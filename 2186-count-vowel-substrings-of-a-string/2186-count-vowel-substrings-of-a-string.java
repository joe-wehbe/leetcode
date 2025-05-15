public class Solution {
    public int countVowelSubstrings(String word) {
        Set<Character> vowels = Set.of('a', 'e', 'i', 'o', 'u');
        int n = word.length();
        int count = 0;

        for (int i = 0; i < n; i++) {
            if (!vowels.contains(word.charAt(i))) continue;

            Set<Character> seen = new HashSet<>();
            for (int j = i; j < n; j++) {
                char ch = word.charAt(j);
                if (!vowels.contains(ch)) break;

                seen.add(ch);
                if (seen.size() == 5) {
                    count++;
                }
            }
        }

        return count;
    }
}