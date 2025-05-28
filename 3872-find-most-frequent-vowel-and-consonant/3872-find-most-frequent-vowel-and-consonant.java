class Solution {
    public int maxFreqSum(String s) {
        Map<Character, Integer> map = new HashMap<>();
        
        for (int i = 0; i < s.length(); i++) {
            map.put(s.charAt(i), map.getOrDefault(s.charAt(i), 0) + 1);
        }

        Set<Character> set = Set.of('a', 'e', 'i', 'o', 'u');
        int maxVowel = 0;
        int maxConsonant = 0;

        for (Map.Entry<Character, Integer> entry:map.entrySet()) {
            Character letter = entry.getKey();
            int freq = entry.getValue();

            if (set.contains(letter)) {
                maxVowel = Math.max(freq, maxVowel);
            } else {
                maxConsonant = Math.max(freq, maxConsonant);
            }
        }

        return maxVowel + maxConsonant;
    }
}