class Solution {
    public  int mostWordsFound(String[] sentences) {
        int maxCount = 0;

        for(int i = 0; i < sentences.length; i++){
             if(maxCount < sentences[i].split(" ").length){
                 maxCount = sentences[i].split(" ").length;
             }
        }      
        return maxCount;
    }
}