class Solution {
    public boolean detectCapitalUse(String word) {
        return 
            word.equals(word.toUpperCase()) || 
            word.equals(word.toLowerCase()) || 
            Character.toString(word.charAt(0)).equals(Character.toString(word.charAt(0)).toUpperCase()) &&
            word.substring(1).equals(word.substring(1).toLowerCase());
    }
}