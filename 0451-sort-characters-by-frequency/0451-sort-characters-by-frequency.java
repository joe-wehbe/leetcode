class Solution {
    public String frequencySort(String s) {
        Map<Character, Integer> map = new HashMap<>();

        for (int i = 0; i < s.length(); i++) {
            map.put(s.charAt(i), map.getOrDefault(s.charAt(i), 0) + 1);
        }

        List<Character> list = new ArrayList<>(map.keySet());
        list.sort((a, b) -> map.get(b) - map.get(a));

        StringBuilder sb = new StringBuilder();

        for (char c : list) {
            int freq = map.get(c);

            while (freq > 0) {
                sb.append(c);
                freq--;
            }
        }

        return sb.toString();
    }
}