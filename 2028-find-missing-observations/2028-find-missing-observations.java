class Solution {
    public int[] missingRolls(int[] rolls, int mean, int n) {
        
        int[] result = new int[n];
        int length = rolls.length + n;
        int sum = n;
        int index = 0;
        
        for(int roll : rolls) sum += roll;  
        for(int i = 0; i < result.length; i++) result[i] = 1;
            
        while(sum / length != mean || sum % length != 0){
            
            result[index]++;
            
            if(result[index] > 6) 
                return new int[0];
            
            index++;
            sum++;
            
            if(index == result.length) 
                index = 0;
        }
        return result;
    }
}