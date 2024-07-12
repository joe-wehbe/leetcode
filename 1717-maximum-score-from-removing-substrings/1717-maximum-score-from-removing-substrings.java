class Solution {
    public int maximumGain(String s, int x, int y) {
        StringBuilder sb = new StringBuilder(s);
        int points = 0;
        
        if(x > y){
            for(int i = 0; i < sb.length() -1; i++){
                if(sb.charAt(i) == 'a' && sb.charAt(i+1) == 'b'){
                    sb.deleteCharAt(i+1);
                    sb.deleteCharAt(i);
                    points += x;
                    if(i >= 2){
                        i -= 2;
                    }
                    else{
                        i = -1;
                    }
                }
            }       
            for(int i = 0; i < sb.length() - 1; i++){
                if(sb.charAt(i) == 'b' && sb.charAt(i+1) == 'a'){
                    sb.deleteCharAt(i+1);
                    sb.deleteCharAt(i);
                    points += y;
                    if(i >= 2){
                        i -= 2;
                    }
                    else{
                        i = -1;
                    }
                }
            }
        }
        else{
            for(int i = 0; i < sb.length() - 1; i++){
                if(sb.charAt(i) == 'b'){
                    if(sb.charAt(i+1) == 'a'){
                        sb.deleteCharAt(i+1);
                        sb.deleteCharAt(i);
                        points += y;
                        if(i >= 2){
                            i -= 2;
                        }
                        else{
                            i = -1;
                        }
                    }
                }
            }      
            for(int i = 0; i < sb.length() - 1; i++){
                if(sb.charAt(i) == 'a' && sb.charAt(i+1) == 'b'){
                    sb.deleteCharAt(i+1);
                    sb.deleteCharAt(i);
                    points += x;
                    if(i >= 2){
                        i -= 2;
                    }
                    else{
                        i = -1;
                    }
                }
            }
            
        }
        return points;
    }
}