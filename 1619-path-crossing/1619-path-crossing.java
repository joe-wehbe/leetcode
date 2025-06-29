class Solution {
    public boolean isPathCrossing(String path) {
        Set<String> set = new HashSet<>();
        int x = 0, y = 0;
        set.add("0,0");

        for (char dir : path.toCharArray()) {
            if (dir == 'N') y++;
            else if (dir == 'E') x++;
            else if (dir == 'S') y--;
            else x--;

            if (!set.add(x + "," + y)) return true;
        }

        return false;
    }
}