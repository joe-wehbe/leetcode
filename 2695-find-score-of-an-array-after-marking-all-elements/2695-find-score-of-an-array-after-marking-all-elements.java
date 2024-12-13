class Solution {
    public long findScore(int[] nums) {
        int n = nums.length;
        int[][] matrix = new int[n][2];

        for (int i = 0; i < n; i++) {
            matrix[i][0] = nums[i];
            matrix[i][1] = i;
        }

        Arrays.sort(matrix, (a, b) -> a[0] - b[0]);

        boolean[] marked = new boolean[n];
        long result = 0;

        for (int[] arr : matrix) {
            int value = arr[0];
            int index = arr[1];

            if (!marked[index]) {
                result += value;

                marked[index] = true;

                if (index > 0)
                    marked[index - 1] = true;
                if (index < n - 1) 
                    marked[index + 1] = true;
            }
        }
        return result;
    }
}