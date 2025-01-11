class Solution {
    public List<String> wordSubsets(String[] words1, String[] words2) {
        int[] maxRequirements = new int[26];

        for (String word : words2) {
            int[] temp = new int[26];
            for (char c : word.toCharArray()) {
                temp[c - 'a']++;
            }
            for (int i = 0; i < 26; i++) {
                maxRequirements[i] = Math.max(maxRequirements[i], temp[i]);
            }
        }

        List<String> universal = new ArrayList<>();
        for (String word : words1) {
            int[] freq = new int[26];
            for (char c : word.toCharArray()) {
                freq[c - 'a']++;
            }

            boolean isUniversal = true;
            for (int i = 0; i < 26; i++) {
                if (freq[i] < maxRequirements[i]) {
                    isUniversal = false;
                    break;
                }
            }

            if (isUniversal) {
                universal.add(word);
            }
        }

        return universal;
    }
}
