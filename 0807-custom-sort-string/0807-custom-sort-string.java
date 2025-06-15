class Solution {
    public String customSortString(String order, String s) {
        Map<Character, Integer> map = new LinkedHashMap<>();
        StringBuilder result = new StringBuilder();

        for (int i = 0; i < order.length(); i++) {
            map.put(order.charAt(i), 0);
        }

        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            if (map.containsKey(c)) map.put(c, map.getOrDefault(c, 0) + 1);
            else result.append(c);
        }

        for (Map.Entry<Character, Integer> entry:map.entrySet()) {
            char c = entry.getKey();
            int freq = entry.getValue();
            while (freq-- > 0) result.append(c);
        }

        return result.toString();
    }
}