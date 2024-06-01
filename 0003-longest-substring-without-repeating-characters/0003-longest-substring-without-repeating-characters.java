import java.util.ArrayList;

class Solution {
    public int lengthOfLongestSubstring(String s) {
        ArrayList<Character> substring = new ArrayList<Character>();
        int maxLength = 0;

        for(int i = 0; i < s.length(); i++){
            if(!substring.contains(s.charAt(i))){
                substring.add(s.charAt(i));
                
                if(substring.size() > maxLength){
                    maxLength = substring.size();
                }
            }else{
                while(substring.contains(s.charAt(i))){
                    substring.remove(0);
                }
                substring.add(s.charAt(i));
            }
        }
        return maxLength;
    }
}