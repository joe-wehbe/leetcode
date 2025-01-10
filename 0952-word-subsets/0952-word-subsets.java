class Solution {
    public List<String> wordSubsets(String[] words1, String[] words2) {
        Map<Character, Integer> requirements = new HashMap<>();

        for (String word : words2) {
            Map<Character, Integer> temp = new HashMap<>();

            for (int i = 0; i < word.length(); i++) {
                temp.put(word.charAt(i), temp.getOrDefault(word.charAt(i), 0) + 1);
            }

            for (Map.Entry<Character, Integer> entry : temp.entrySet()) {
                char key = entry.getKey();
                int value = entry.getValue();  
                requirements.put(key, Math.max(requirements.getOrDefault(key, 0), value));
            }
        }

        List<String> universal = new ArrayList<>();

        for (String word : words1) {
            Map<Character, Integer> frequency = new HashMap<>();
            boolean isUniversal = true;
    
            for (int i = 0; i < word.length(); i++) {
                frequency.put(word.charAt(i), frequency.getOrDefault(word.charAt(i), 0) + 1);
            }

            for (Map.Entry<Character, Integer> entry : requirements.entrySet()) {
                char key = entry.getKey();
                int value = entry.getValue();

                if (frequency.getOrDefault(key, 0) < value) {
                    isUniversal = false;
                }
            }

            if (isUniversal) {
                universal.add(word);
            }
        }

        return universal;
    }
}