class Solution {
    public int romanToInt(String s) {
        Map<String, Integer> map = new HashMap<>();
        map.put("I", 1);
        map.put("IV", 4);
        map.put("V", 5);
        map.put("IX", 9);
        map.put("X", 10);
        map.put("XL", 40);
        map.put("L", 50);
        map.put("XC", 90);
        map.put("C", 100);
        map.put("CD", 400);
        map.put("D", 500);
        map.put("CM", 900);
        map.put("M", 1000);

        int result = 0;
        int i = 0;

        while (i < s.length()) {
            if (i+1 < s.length()) {
                String sub = s.substring(i, i+2);
                
                if (map.containsKey(sub)) {
                    result += map.get(sub);
                    i += 2;
                    continue;
                }
            }

            result += map.get(s.substring(i, i+1));
            i++;
        }

        return result;
    }
}