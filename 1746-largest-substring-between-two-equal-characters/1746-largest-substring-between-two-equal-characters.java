class Solution {
    public int maxLengthBetweenEqualCharacters(String s) {
        Map<Character, int[]> map = new HashMap<>();
        int result = -1;

        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            if (!map.containsKey(c)) {
                map.put(c, new int[]{i, i});
            } else {
                map.get(c)[1] = i;
            }
        }

        for (int[] indices : map.values()) {
            if (indices[0] != indices[1]) {
                result = Math.max(result, indices[1] - indices[0] - 1);
            }
        }

        return result;
    }
}
