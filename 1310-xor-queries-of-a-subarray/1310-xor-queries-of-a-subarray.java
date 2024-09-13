class Solution {
    public int[] xorQueries(int[] arr, int[][] queries) {
        
        int[] result = new int[queries.length];
        int index = 0;
        
        for(int[] query : queries){
            for(int i = query[0]; i <= query[1]; i++){
                result[index] ^= arr[i];
            }
            index++;
        }
        return result;
    }
}