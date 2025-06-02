class Solution {
    public String reverseStr(String s, int k) {
        StringBuilder result = new StringBuilder();
        StringBuilder sb = new StringBuilder();
        int count = 0;

        for (int i = 0; i < s.length(); i++) {
            sb.append(s.charAt(i));
            count++;

            if (count == k) {
                sb.reverse();
                result.append(sb.toString());
                sb.setLength(0);
            }

            if (count == 2*k) {
                count = 0;
                result.append(sb.toString());
                sb.setLength(0);
            }

        }

        if (count <= k) {
            result.append(sb.reverse().toString());
        }
        else {
            result.append(sb.toString());
        }

        return result.toString();
    }
}                                                                                                            