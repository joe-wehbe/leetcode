class Solution {
    public String firstPalindrome(String[] words) {
        boolean isPalindrome = false;
        
        for(int i = 0; i < words.length; i++){
            isPalindrome  = isPalindrome(words[i]);
            
            if(isPalindrome == true){
                return words[i];
            }
        }
        return "";
    }
    
    private Boolean isPalindrome(String s){
        int i = 0;
        int j = s.length() - 1;
        
        while(s.charAt(i) == s.charAt(j)){
            if(i >= j ){
                return true;
            }
            i++;
            j--;
        }
        return false;
    }
}