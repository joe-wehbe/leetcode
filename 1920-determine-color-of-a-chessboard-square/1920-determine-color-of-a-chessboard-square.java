class Solution {
    public boolean squareIsWhite(String coordinates) {
        int x = (int) coordinates.charAt(0) - 96;
        int y = Integer.parseInt(Character.toString(coordinates.charAt(1)));

        return (x + y) % 2 == 0 ? false : true;
    }
}