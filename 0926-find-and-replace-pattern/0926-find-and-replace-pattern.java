class Solution {
    public List<String> findAndReplacePattern(String[] words, String pattern) {
        List<String> result = new ArrayList<>();

        for (String word : words) {
            if (matches(word, pattern)) {
                result.add(word);
            }
        }

        return result;
    }

    private boolean matches(String word, String pattern) {
        Map<Character, Character> wp = new HashMap<>();
        Map<Character, Character> pw = new HashMap<>();

        for (int i = 0; i < word.length(); i++) {
            char w = word.charAt(i);
            char p = pattern.charAt(i);

            if (!wp.containsKey(w)) wp.put(w, p);
            if (!pw.containsKey(p)) pw.put(p, w);
            if (wp.get(w) != p || pw.get(p) != w) return false;
        }

        return true;
    }
}
