class Solution {
    public static boolean isPowerOfThree(int n) {    

        if(n <= 0){
            return false;
        }
        
        while(n >= 1){
            if(n != 1 && n % 3 != 0){
               return false;
            }
            n /= 3;
        } 
        
        return true;
    }
}