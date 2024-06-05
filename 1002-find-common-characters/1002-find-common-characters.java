import java.util.List;
import java.util.ArrayList;

class Solution {
    public List<String> commonChars(String[] words) {
        List<String> chars = new ArrayList<String>();

        for(int i = 0; i < words[0].length(); i++){
            chars.add(Character.toString(words[0].charAt(i)));
        }
        
        for(int i = 1; i < words.length; i++){
            for(int j = 0; j < chars.size(); j++){
                if(!words[i].contains(chars.get(j))){
                    chars.remove(chars.get(j));
                    j--;
                }
                else{
                    int index = words[i].indexOf(chars.get(j));
                    words[i] = words[i].substring(0, index) + words[i].substring(index +1);
                }
            }
        }
        return chars;
    }
}