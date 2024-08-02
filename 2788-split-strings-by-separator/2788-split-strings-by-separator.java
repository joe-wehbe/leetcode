class Solution {
    public List<String> splitWordsBySeparator(List<String> words, char separator) {
        List<String> list = new ArrayList<>();
        StringBuilder sb = new StringBuilder();
        
        for (String word : words) {
            for (int j = 0; j < word.length(); j++) {
                if (word.charAt(j) != separator) {
                    sb.append(word.charAt(j));
                } else if (sb.length() > 0) {
                    list.add(sb.toString());
                    sb.setLength(0);
                }
            }
            if (sb.length() > 0) {
                list.add(sb.toString());
                sb.setLength(0);
            }
        }
        return list;
    }
}
