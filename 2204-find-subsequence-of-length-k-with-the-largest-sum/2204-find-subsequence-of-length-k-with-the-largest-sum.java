class Solution {
    public int[] maxSubsequence(int[] nums, int k) {
        int[][] matrix = new int[nums.length][2];
        int[] result = new int[k];

        for (int i = 0; i < nums.length; i++) {
            matrix[i][0] = nums[i];
            matrix[i][1] = i;
        }

        Arrays.sort(matrix, (a, b) -> Integer.compare(b[0], a[0]));
        Arrays.sort(matrix, 0, k, (a, b) -> Integer.compare(a[1], b[1]));

        for (int i = 0; i < k; i++) {
            result[i] = matrix[i][0];
        }

        return result;
    }
}

