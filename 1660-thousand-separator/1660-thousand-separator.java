class Solution {
    public String thousandSeparator(int n) {
        StringBuilder sb = new StringBuilder();
        String num = Integer.toString(n);
        int count = 0;

        for (int i = num.length()-1; i >= 0; i--) {
            sb.append(num.charAt(i));
            count++;
            if (count == 3 && i > 0) {
                sb.append('.');
                count = 0;
            }
        }

        return sb.reverse().toString();
    }
}