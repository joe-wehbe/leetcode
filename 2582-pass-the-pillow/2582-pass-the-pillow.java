class Solution {
    public int passThePillow(int n, int time) {
        
        boolean forward = true;
        int index = 1;
        
        for(int i = 0; i < time; i++){
            if(forward){
                index++;      
                if(index == n){
                    forward = false;
                }
            }
            else{
                index--;
                if(index == 1){
                    forward = true;
                }
            }
        }
        return index;
    }
}