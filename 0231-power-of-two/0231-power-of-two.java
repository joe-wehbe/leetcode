class Solution {
    public static boolean isPowerOfTwo(int n) {    

                if(n <= 0){
            return false;
        }
        
        while(n >= 1){
            if(n != 1 && n % 2 != 0){
               return false;
            }
            n /= 2;
        } 
        
        return true;
    }
}