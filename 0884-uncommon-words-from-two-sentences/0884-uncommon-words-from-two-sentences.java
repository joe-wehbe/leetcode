class Solution {
    public String[] uncommonFromSentences(String s1, String s2) {
        
        HashMap<String, Integer> map = new HashMap<>();
        List<String> uncommonWords = new ArrayList<>();

        String[] words1 = s1.split(" ");
        for(String word : words1)
            map.put(word, map.getOrDefault(word, 0) + 1);
        
        String[] words2 = s2.split(" ");
        for(String word : words2)
            map.put(word, map.getOrDefault(word, 0) + 1);
            
        for(Map.Entry<String, Integer> entry : map.entrySet()) {
            if(entry.getValue() == 1){
                uncommonWords.add(entry.getKey());         
            }
        }
        return uncommonWords.toArray(new String[uncommonWords.size()]);
    }
}