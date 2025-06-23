class Solution {
    public boolean isIsomorphic(String s, String t) {
        Map<Character, Character> map1 = new HashMap<>();
        Map<Character, Character> map2 = new HashMap<>();

        for (int i = 0; i < s.length(); i++) {
            char cs = s.charAt(i);
            char ct = t.charAt(i);

            if ((map1.containsKey(cs) && map1.get(cs) != ct) || (map2.containsKey(ct) && map2.get(ct) != cs)) 
                return false;

            map1.put(cs, ct); 
            map2.put(ct, cs);
        }

        return true;
    }
}