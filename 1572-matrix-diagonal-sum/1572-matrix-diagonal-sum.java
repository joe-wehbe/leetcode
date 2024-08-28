class Solution {
    public int diagonalSum(int[][] mat) {
        
        int primary = 0;
        int secondary = 0;
        
        int j = 0;
        int k = mat[0].length - 1;
        
        for(int i = 0; i < mat.length; i++){
            primary += mat[i][j];
            secondary += mat[i][k];
            j++;
            k--;
        }
        
        if(mat.length % 2 != 0)
            return primary + secondary - mat[mat.length / 2][mat[0].length / 2];
        return primary + secondary;
    }
}