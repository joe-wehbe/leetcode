class Solution {
    public int[] numberOfLines(int[] widths, String s) {
        int line = 1;
        int currentWidth = 0;
        int[] result = new int[2];

        for (int i = 0; i < s.length(); i++) {
            int pixels = widths[s.charAt(i) - 'a'];

            if(currentWidth + pixels <= 100) {
                currentWidth += pixels;
            }
            else {
                currentWidth = pixels;
                line++;
            }
        }

        result[0] = line;
        result[1] = currentWidth;

        return result;
    }
}

