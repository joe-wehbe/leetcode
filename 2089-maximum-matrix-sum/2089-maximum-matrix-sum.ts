function maxMatrixSum(matrix: number[][]): number {
    let sum = 0;
    let negativeCount = 0;
    let minAbs = Number.MAX_SAFE_INTEGER;

    for (let i = 0; i < matrix.length; i++) {
        for (let j = 0; j < matrix[i].length; j++) {
            sum += Math.abs(matrix[i][j]);
            minAbs = Math.min(minAbs, Math.abs(matrix[i][j]));
            if (matrix[i][j] < 0) negativeCount++;
        }
    }

    return negativeCount % 2 === 0 ? sum : sum - 2 * minAbs;
}