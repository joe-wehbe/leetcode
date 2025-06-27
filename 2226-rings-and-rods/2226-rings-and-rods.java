class Solution {
    public int countPoints(String rings) {
        Map<Character, Set<Character>> map = new HashMap<>();

        for (int i = 0; i < rings.length(); i += 2) {
            char color = rings.charAt(i);
            char rod = rings.charAt(i + 1);

            map.putIfAbsent(rod, new HashSet<>());
            map.get(rod).add(color);
        }

        int count = 0;

        for (Set<Character> colors : map.values()) {
            if (colors.contains('R') && colors.contains('G') && colors.contains('B')) {
                count++;
            }
        }

        return count;
    }
}