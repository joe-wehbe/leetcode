class Solution {
    public String truncateSentence(String s, int k) {
        
        int i = 0;
        int spaceCount = 0;
        String truncated = " ";
        
        while(spaceCount < k){
            if(i == s.length()){
                return s;
            }
            
            if(s.charAt(i) == ' '){
                spaceCount++;
            }
            
            if(spaceCount == k){
                System.out.println(i);
                truncated = s.substring(0, i);
            }
            i++;
        }
        return truncated;
    }
}