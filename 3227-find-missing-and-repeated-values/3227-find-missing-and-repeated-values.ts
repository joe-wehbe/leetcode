function findMissingAndRepeatedValues(grid: number[][]): number[] {
    let size = grid.length**2;
    let count = new Array(size + 1).fill(0);
    let duplicate = -1, missing = -1;

    for (const row of grid) {
        for (const num of row) {
            count[num]++;
            if (count[num] > 1) duplicate = num;
        }
    }

    for (let i = 1; i <= size; i++) {
        if (count[i] === 0) missing = i;
    }

    return [duplicate, missing];
}