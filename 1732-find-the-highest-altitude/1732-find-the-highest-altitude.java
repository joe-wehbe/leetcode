class Solution {
    public int largestAltitude(int[] gain) {
        int[] altitudes = new int[gain.length + 1];
        altitudes[0] = 0;
        
        int altitudeGain = 0;
        for(int i = 1; i < altitudes.length; i++){
            altitudeGain += gain[i-1];
            altitudes[i] = altitudeGain;
        }
        
        int maxGain = 0;
        for(int i = 0; i < altitudes.length; i++){
            if(altitudes[i] > maxGain){
                maxGain = altitudes[i];
            }
        }
        return maxGain;
    }
}