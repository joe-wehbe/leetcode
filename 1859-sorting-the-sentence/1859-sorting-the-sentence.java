class Solution {
    public String sortSentence(String s) {
        
        int words = 1;
        for(int i = 0; i < s.length(); i++){
            if(s.charAt(i) == ' ')
                words++;
        }
        
        int startIndex = 0;
        String[] sorted = new String[words];
        for(int i = 0; i < s.length(); i++){
            if(i == s.length() - 1 || s.charAt(i) == ' '){
                if(s.charAt(i) == ' ') {
                   sorted[Integer.parseInt(Character.toString(s.charAt(i-1))) - 1] = s.substring(startIndex, i-1);
                    startIndex = i+1;                 
                }                
                if(i == s.length() - 1)
                    sorted[Integer.parseInt(Character.toString(s.charAt(i))) - 1] = s.substring(startIndex, i);
            } 
        }
        
        StringBuilder sb = new StringBuilder();
        for(int i = 0; i < sorted.length; i++)
            sb.append(sorted[i] + " ");
        
        return sb.toString().trim();
    }
}