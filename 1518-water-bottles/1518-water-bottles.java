class Solution {
    public int numWaterBottles(int numBottles, int numExchange) {
        
        int output = numBottles;
        
        while(numBottles >= numExchange){
            output += numBottles / numExchange;
            numBottles = numBottles % numExchange + numBottles / numExchange;
        }
    
        return output;
    }
}
