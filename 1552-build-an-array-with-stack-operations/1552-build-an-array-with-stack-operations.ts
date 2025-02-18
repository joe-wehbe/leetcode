function buildArray(target: number[], n: number): string[] {
    let operations: string[] = [];
    let index = 0;
    let i = 1;

    while (index < target.length && i <= n) {
        if (i == target[index]) {
            operations.push("Push");
            index++;
        } else {
            operations.push("Push");
            operations.push("Pop");
        }
        i++;
    }

    return operations;
};