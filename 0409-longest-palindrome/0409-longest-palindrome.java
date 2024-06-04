import java.util.HashMap;
import java.util.Map;

class Solution {
    public int longestPalindrome(String s) {
        HashMap<Character, Integer> map = new HashMap<>();
        boolean containsSingle = false;
        int length = 0;

        for(int i = 0; i < s.length(); i++){
            map.put(s.charAt(i), map.getOrDefault(s.charAt(i), 0) + 1);
        }
        
        if(map.size() == 1){
            return s.length();
        }
        
        for (Map.Entry<Character, Integer> entry : map.entrySet()) {
            if(entry.getValue() % 2 == 0){
                length += entry.getValue();
            }
            else{
                length += entry.getValue() - 1;
                containsSingle = true;
            }
        }
        
        if(containsSingle){
            length++;
        }
        return length;
    }
}