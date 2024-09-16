class Solution {
    public static int findMinDifference(List<String> timePoints) {
        
        Collections.sort(timePoints);
        timePoints.add(Integer.toString(Integer.parseInt(timePoints.get(0).substring(0,2)) + 24) + ":" + timePoints.get(0).substring(3));
        int minMinutes = Integer.MAX_VALUE;
    
        for(int i = 0; i < timePoints.size() - 1; i++) {
            int firstTimeInMinutes = Integer.parseInt(timePoints.get(i).substring(0,2)) * 60 + Integer.parseInt(timePoints.get(i).substring(3));      
            int secondTimeInMinutes = Integer.parseInt(timePoints.get(i+1).substring(0,2)) * 60 + Integer.parseInt(timePoints.get(i+1).substring(3));
            
            if(secondTimeInMinutes - firstTimeInMinutes < minMinutes)
                minMinutes = secondTimeInMinutes - firstTimeInMinutes;
        }
        return minMinutes;
    }
}