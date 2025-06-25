class Solution {
    public int countCharacters(String[] words, String chars) {
        int[] charArr = new int[26];
        int result = 0;

        for (int i = 0 ; i < chars.length(); i++) {
            charArr[chars.charAt(i) - 97]++;
        }

        for (String word : words) {
            int[] wordArr = new int[26];
            for (int i = 0; i < word.length(); i++) {
                wordArr[word.charAt(i) - 97]++;
            }

            boolean canForm = true;
            for (int i = 0; i < wordArr.length; i++) {
                if (wordArr[i] != 0) {
                    if (wordArr[i] > charArr[i]) {
                        canForm = false;
                        break;
                    }
                }
            }

            if (canForm) result += word.length();
        }

        return result;
    }
}