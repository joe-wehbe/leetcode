class Solution {
    public int romanToInt(String s) {
        Map<Character, Integer> map = new HashMap<>();
        map.put('I', 1);
        map.put('V', 5);
        map.put('X', 10);
        map.put('L', 50);
        map.put('C', 100);
        map.put('D', 500);
        map.put('M', 1000);

        int result = 0;
        int i = 0;

        while (i < s.length()) {
            int curr = map.get(s.charAt(i));
            int next = (i + 1 < s.length()) ? map.get(s.charAt(i+1)) : 0; 

            if (curr < next) {
                result += next - curr;
                i += 2;
            }
            else {
                result += curr;
                i++;
            }
        }

        return result;
    }
}