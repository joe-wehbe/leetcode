class Solution {
    public int numWaterBottles(int numBottles, int numExchange) {
        
        int output = numBottles;
        int empty = numBottles;
        
        while(empty >= numExchange){
            output += empty / numExchange;
            empty = empty % numExchange + empty / numExchange;
        }
    
        return output;
    }
}
