class Solution {
    public int maximumValue(String[] strs) {
        
        int max = 0;
        for (int i = 0; i < strs.length; i++) {
            try {
                if(Integer.parseInt(strs[i]) > max)
                    max = Integer.parseInt(strs[i]);
            } catch (NumberFormatException e){
                if(strs[i].length() > max){
                    max = strs[i].length();
                }
            }
        }
        return max;
    }
}