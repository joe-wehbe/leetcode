class Solution {
    public static int lengthOfLastWord(String s) {
        
        int index = s.length() - 1;
        int count = 0;
        
        while(s.charAt(index) == ' '){
            index--;
        }
        
        while(s.charAt(index) != ' '){
            count++;
            index--;
            
            if(index < 0){
                break;
            }
        }
        return count;
    }
}