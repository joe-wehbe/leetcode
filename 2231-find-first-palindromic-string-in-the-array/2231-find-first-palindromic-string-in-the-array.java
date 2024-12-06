class Solution {
    public String firstPalindrome(String[] words) {
        
        for(int i = 0; i < words.length; i++){            
            if(isPalindrome(words[i])){
                return words[i];
            }
        }
        return "";
    }
    
    private Boolean isPalindrome(String s){
        int i = 0;
        int j = s.length() - 1;
        
        while(s.charAt(i) == s.charAt(j)){
            if(i >= j){
                return true;
            }
            i++;
            j--;
        }
        return false;
    }
}