function minimumOperations(nums: number[]): number {
    let operations = 0;

    while (new Set(nums).size !== nums.length) {
        nums.splice(0, 3);
        operations++;
    }

    return operations;
}
