class Solution {
    public int[][] spiralMatrixIII(int rows, int cols, int rStart, int cStart) {
        int[][] visitingOrder = new int[rows * cols][2];
        int direction = 0;
        int visitedCount = 0;
        int advance = 1;

        visitingOrder[visitedCount][0] = rStart;
        visitingOrder[visitedCount][1] = cStart;
        visitedCount++;

        while (visitedCount < rows * cols) {
            if (direction == 0) {
                int forward = advance;
                while (forward > 0 && visitedCount < rows * cols) {
                    cStart++;
                    if (cStart >= 0 && cStart < cols && rStart >= 0 && rStart < rows) {
                        visitingOrder[visitedCount][0] = rStart;
                        visitingOrder[visitedCount][1] = cStart;
                        visitedCount++;
                    }
                    forward--;
                }
                direction++;
            }

            if (direction == 1) {
                int forward = advance;
                while (forward > 0 && visitedCount < rows * cols) {
                    rStart++;
                    if (cStart >= 0 && cStart < cols && rStart >= 0 && rStart < rows) {
                        visitingOrder[visitedCount][0] = rStart;
                        visitingOrder[visitedCount][1] = cStart;
                        visitedCount++;
                    }
                    forward--;
                }
                direction++;
            }

            advance++;

            if (direction == 2) {
                int forward = advance;
                while (forward > 0 && visitedCount < rows * cols) {
                    cStart--;
                    if (cStart >= 0 && cStart < cols && rStart >= 0 && rStart < rows) {
                        visitingOrder[visitedCount][0] = rStart;
                        visitingOrder[visitedCount][1] = cStart;
                        visitedCount++;
                    }
                    forward--;
                }
                direction++;
            }

            if (direction == 3) {
                int forward = advance;
                while (forward > 0 && visitedCount < rows * cols) {
                    rStart--;
                    if (cStart >= 0 && cStart < cols && rStart >= 0 && rStart < rows) {
                        visitingOrder[visitedCount][0] = rStart;
                        visitingOrder[visitedCount][1] = cStart;
                        visitedCount++;
                    }
                    forward--;
                }
                direction = 0;
            }
            advance++;
        }
        return visitingOrder;
    }
}
