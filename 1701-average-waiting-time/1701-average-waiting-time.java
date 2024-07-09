class Solution {
    public double averageWaitingTime(int[][] customers) {
        
        double time = customers[0][0];
        double waitingTime = 0;
        
        for(int i = 0; i < customers.length; i++){
            
            if(customers[i][0] > time){
                time = customers[i][0];
            }
            
            waitingTime += (time + customers[i][1]) - customers[i][0];
            time += customers[i][1];
        }  
        return waitingTime / customers.length;
    }
}