class Solution {
    public int mostWordsFound(String[] sentences) {
        int maxCount = 0;
        int count = 1;
        
        for(int i = 0; i < sentences.length; i++){
            count = 1;
            for(int j = 0; j < sentences[i].length(); j++){
                if(sentences[i].charAt(j) == ' '){
                    count++;
                }
            }
            if(count > maxCount){
                maxCount = count;
            }
        }
        return maxCount;
    }
}