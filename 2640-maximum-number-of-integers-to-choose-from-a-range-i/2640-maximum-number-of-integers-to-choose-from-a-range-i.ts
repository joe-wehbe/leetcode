function maxCount(banned: number[], n: number, maxSum: number): number {
    let set: Set<number> = new Set(banned);
    let sum = 0;
    let count = 0;

    for(let i = 1; i <= n; i++) {
        if(!set.has(i) && sum + i <= maxSum) {
            sum += i;
            count++;
        }
    }

    return count;
};