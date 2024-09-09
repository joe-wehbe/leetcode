class Solution {
    public int firstUniqChar(String s) {      
        for(int i = 0; i < s.length(); i++){
            if(s.indexOf(s.charAt(i), s.indexOf(s.charAt(i)) + 1) == -1)
                return s.indexOf(s.charAt(i));
        }
        return -1;
    }
}