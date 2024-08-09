class Solution {
    public int countAsterisks(String s) {
        
        boolean inPair = false;
        int count = 0;
        
        for(int i = 0; i < s.length(); i++){
            if(s.charAt(i) == '|')
                inPair = !inPair;
            
            if(!inPair && s.charAt(i) == '*')
                count++;
        }
        return count;
    }
}