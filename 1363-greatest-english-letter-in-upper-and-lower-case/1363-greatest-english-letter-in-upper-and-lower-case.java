class Solution {
    public String greatestLetter(String s) {
        Set<Character> set = new HashSet<>();
        int greatest = -1;

        for (int i = 0; i < s.length(); i++) {
            set.add(s.charAt(i));
        }

        for (int i = 0; i < s.length(); i++) {
            char lower = Character.toLowerCase(s.charAt(i));
            char upper = Character.toUpperCase(s.charAt(i));

            if (set.contains(lower) && set.contains(upper)) {
                greatest = Math.max(greatest, (int) upper);
            }
        }

        return greatest == -1 ? "" : Character.toString((char) greatest);
    }
}