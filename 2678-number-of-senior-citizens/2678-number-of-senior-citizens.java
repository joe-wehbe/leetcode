class Solution {
    public int countSeniors(String[] details) {
        
        int count = 0;
        for(String passenger : details){
            if(Integer.parseInt(passenger.substring(11, 13)) > 60){
                count++;
            }
        }
        return count;
    }
}