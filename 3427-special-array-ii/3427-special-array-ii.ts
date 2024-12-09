function isArraySpecial(nums: number[], queries: number[][]): boolean[] {
    const n = nums.length;

    if (n === 1) return queries.map(() => true);

    const violations = new Array(n).fill(0);
    const prefixSum = new Array(n).fill(0);
    const result: boolean[] = [];

    for (let i = 0; i < n - 1; i++) {
        if ((nums[i] % 2) === (nums[i + 1] % 2)) {
            violations[i] = 1;
        }
    }

    prefixSum[0] = violations[0];
    for (let i = 1; i < n; i++) {
        prefixSum[i] = prefixSum[i - 1] + violations[i];
    }

    for (const [start, end] of queries) {
        if (start === end) {
            result.push(true);
        } else {
            const totalViolations = prefixSum[end - 1] - (start > 0 ? prefixSum[start - 1] : 0);
            result.push(totalViolations === 0);
        }
    }

    return result;
}
