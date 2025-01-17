class Solution {
    public boolean digitCount(String num) {
        Map<Character, Integer> map = new HashMap<>();

        for (Character c : num.toCharArray()) {
            map.put(c, map.getOrDefault(c, 0) + 1);
        }

        for (int i = 0; i < num.length(); i++) {
            if (map.getOrDefault((char) (i + '0'), 0) != (num.charAt(i) - '0')) return false;
        }

        return true;
    }
}