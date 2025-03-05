function coloredCells(n: number): number {
    let total = 1;
    let add = 0;

    for (let i = 2 ; i <= n; i++) {
        add += 4;
        total += add;
    }

    return total;
};