class Solution {
    public int[] findThePrefixCommonArray(int[] A, int[] B) {
        int n = A.length;
        int[] C = new int[n];
        int[] frequency = new int[n];
        int twos = 0;

        for (int i = 0; i < n; i++) {
            frequency[A[i] - 1]++;
            frequency[B[i] - 1]++;

            if(frequency[A[i] - 1] == 2) twos++;
            if(frequency[B[i] - 1] == 2 && B[i] != A[i]) twos++;

            C[i] = twos;
        }

        return C;
    }
}