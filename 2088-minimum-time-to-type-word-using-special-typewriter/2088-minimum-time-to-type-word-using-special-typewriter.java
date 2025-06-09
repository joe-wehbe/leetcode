class Solution {
    public int minTimeToType(String word) {
        int pointer = 0;
        int time = 0;

        for (int i = 0; i < word.length(); i++) {
            int current = ((int) word.charAt(i)) - 97;
            int distance = Math.abs(current - pointer);
            distance = distance <= 13 ? distance : 26 - distance;
            time += distance + 1;
            pointer = current;
        }

        return time;
    }
}