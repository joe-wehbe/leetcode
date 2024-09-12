class Solution {
    public int countConsistentStrings(String allowed, String[] words) {
        
        HashSet<Character> set = new HashSet<>();
        for(int i = 0; i < allowed.length(); i++)
            set.add(allowed.charAt(i));
        
        int count = 0;
        boolean isConsistent = true;
        
        for(String word : words){
            isConsistent = true;
            for (char ch : word.toCharArray()) {
                 if(!set.contains(ch)){
                     isConsistent = false;
                     break;
                 }
            }
            if(isConsistent){
                count++;
            }
        }
        return count;
    }
}