class Solution {
    public static boolean isPowerOfFour(int n) {    

        if(n <= 0){
            return false;
        }
        
        while(n >= 1){
            if(n != 1 && n % 4 != 0){
               return false;
            }
            n /= 4;
        } 
        
        return true;
    }
}