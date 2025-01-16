class Solution {
    public boolean isPalindrome(String s) {
        s = s.replaceAll("[^a-zA-Z0-9]", "").toLowerCase();

        int j = 0;
        for(int i = s.length() - 1; i > j; i--){
            if(s.charAt(i) != s.charAt(j)){
                return false;
            }
            else{
                j++;
            }
        }

        return true;
    }
}