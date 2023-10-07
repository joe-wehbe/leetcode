class Solution {
    public boolean isPalindrome(int x) {

        String str = Integer.toString(x);

        int j = 0;
        for(int i = str.length() - 1; i > j; i--){
            if(str.charAt(i) != str.charAt(j)){
                return false;
            }
            else{
                j++;
            }
        }
        return true;
    }
}