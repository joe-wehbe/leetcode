class Solution {
    public  int mostWordsFound(String[] sentences) {
        HashMap<String, Integer> map = new HashMap<String, Integer>();
        int maxCount = 0;

        for(int i = 0; i < sentences.length; i++){
            map.put(sentences[i], sentences[i].split(" ").length);
        }
        
        for (Map.Entry<String, Integer> entry : map.entrySet()) {
            if(entry.getValue() > maxCount){
                maxCount = entry.getValue();
            }
        }        
        return maxCount;
    }
}