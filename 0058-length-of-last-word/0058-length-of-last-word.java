class Solution {
    public int lengthOfLastWord(String s) {
        int index = s.length() - 1;
        int count = 0;
        
        while(s.charAt(index) == ' ') {
            index--;
        }
        
        while(s.charAt(index) != ' '){
            if(index == 0){
                count++;
                break;
            }
            else{
                count++;
                index--;
            }
        }
        return count;
    }
}