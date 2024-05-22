class Solution {
    public int[] shortestToChar(String s, char c) {
        
        int count = 0;
        for(int i = 0; i < s.length(); i++){
            if(s.charAt(i) == c){
                count++;
            }
        }
        
        int[] cIndices = new int[count];
        count = 0;
        for(int i = 0; i < s.length(); i++){
            if(s.charAt(i) == c){
                cIndices[count] = i;
                count++;
            }
        }
        
        int distance = 0;
        int minDistance = s.length();
        int[] answer = new int[s.length()];
        for(int i = 0; i < s.length(); i++){
            for(int j = 0; j < cIndices.length; j++){
                distance = Math.abs(i - cIndices[j]);
                if(distance < minDistance){
                    minDistance = distance;
                }
            }
            answer[i] = minDistance;
            minDistance = s.length();
            distance = 0;
        }
        return answer;
    }
}