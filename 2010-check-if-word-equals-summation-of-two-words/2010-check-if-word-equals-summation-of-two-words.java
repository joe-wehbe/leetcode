class Solution {
    public boolean isSumEqual(String firstWord, String secondWord, String targetWord) {
        return numerical(firstWord) + numerical(secondWord) == numerical(targetWord);
    }

    private int numerical(String word) {
        StringBuilder sb = new StringBuilder();

        for (int i = 0; i < word.length(); i++) {
            sb.append(word.charAt(i) - 'a');
        }

        return Integer.parseInt(sb.toString());
    }
}