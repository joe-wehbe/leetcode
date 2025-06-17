class Solution {
    public int furthestDistanceFromOrigin(String moves) {
        int left = 0;
        int right = 0;
        int underscore = 0;

        for (int i = 0; i < moves.length(); i++) {
            char c = moves.charAt(i);
            if (c == 'L') left++;
            else if (c == 'R') right++;
            else if (c == '_') underscore++;
        }

        if (right > left) return right + underscore - left;
        if (left > right) return left + underscore - right;
        return underscore;
    }
}