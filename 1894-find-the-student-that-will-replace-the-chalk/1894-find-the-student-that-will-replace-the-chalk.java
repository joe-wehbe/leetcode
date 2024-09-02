class Solution {
    public static int chalkReplacer(int[] chalk, int k) {
        
        int i = 0;
        while(k >= chalk[i]){            
            k -= chalk[i];
            if(i == chalk.length-1) i = -1;
            i++;
        }
        return i;
    }
}