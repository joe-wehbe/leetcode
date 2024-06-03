class Solution {
    public int appendCharacters(String s, String t) {
        int sIndex = 0;
        int tIndex = 0;
        boolean flag = false;
        
        while(sIndex < s.length() && tIndex < t.length()){
            flag = false;
            
            if((s.charAt(sIndex) == t.charAt(tIndex)) && flag == false){
                sIndex++;
                tIndex++;
                flag = true;
            }
            
            if(flag == false){
                if(s.charAt(sIndex) != t.charAt(tIndex)){
                    sIndex++;
                }   
            }
        }
        
        int count = 0;
        if(tIndex < s.length()){
            for(int i = tIndex; i < t.length(); i++){
                count++;
            }
        }
        return count;
    }
}