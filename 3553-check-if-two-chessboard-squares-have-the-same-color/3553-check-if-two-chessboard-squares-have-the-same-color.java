class Solution {
    public boolean checkTwoChessboards(String coordinate1, String coordinate2) {
        int x1 = (int) coordinate1.charAt(0) - 96;
        int y1 = Integer.parseInt(Character.toString(coordinate1.charAt(1)));
        int x2 = (int) coordinate2.charAt(0) - 96;
        int y2 = Integer.parseInt(Character.toString(coordinate2.charAt(1)));

        return (x1 + y1) % 2 == (x2 + y2) % 2;
    }
}