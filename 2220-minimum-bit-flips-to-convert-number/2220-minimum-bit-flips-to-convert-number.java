class Solution {
    public int minBitFlips(int start, int goal) {
        
        String startStr = Integer.toBinaryString(start);
        String goalStr = Integer.toBinaryString(goal);
        StringBuilder startSb = new StringBuilder(startStr);
        StringBuilder goalSb = new StringBuilder(goalStr);
        int flips = 0;
        
        if(startSb.length() > goalSb.length()){
            while(goalSb.length() < startSb.length()){
                goalSb.insert(0,"0");
            }
        }
        else if(goalSb.length() > startSb.length()){
            while(startSb.length() < goalSb.length()){
                startSb.insert(0,"0");
            }
        }

        for(int i = 0; i < startSb.length(); i++){
            if(startSb.charAt(i) != goalSb.charAt(i))
                flips++;
        }
        return flips;
    }
}