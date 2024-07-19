class Solution {
    public List<Integer> luckyNumbers (int[][] matrix) {
        
        List<Integer> lucky = new ArrayList<>();
        HashSet<Integer> luckySet = new HashSet<>();

       
        for(int[] num : matrix){
            luckySet.add(Arrays.stream(num).min().getAsInt());
        }
        
        int max = 0;
        for(int i = 0; i < matrix[0].length; i++){
            for(int j = 0; j < matrix.length; j++){
                if(matrix[j][i] > max){
                    max = matrix[j][i];
                }
            }
            if(!luckySet.add(max)){
                lucky.add(max);
            }
            max = 0;
        }   
        return lucky;
    }
}