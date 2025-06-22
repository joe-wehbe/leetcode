class Solution {
    public String[] divideString(String s, int k, char fill) {
        int i = 0;
        int index = 0;
        int n = s.length();
        int reminder = n % k;
        String[] result = reminder != 0 ? new String[n / k + 1] : new String[n / k];

        while (i + k -1 < n) {
            result[index++] = s.substring(i, i + k);
            i += k;
        }

        if (reminder != 0) {
            StringBuilder sb = new StringBuilder();
            sb.append(s.substring(n - reminder));
            while (sb.length() < k) sb.append(fill);
            result[result.length-1] = sb.toString();
        } 

        return result;
    }
}