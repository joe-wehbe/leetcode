function calPoints(operations: string[]): number {
    let sum: number = 0;
    let records: number[] = [];

    for (const operation of operations) {
        if (operation === '+') {
            let num = records[records.length - 1] + records[records.length - 2];
            records.push(num);
            sum += num;
        }
        else if (operation === 'D') {
            let num = records[records.length - 1] * 2
            records.push(num);
            sum += num;
        }
        else if (operation === 'C') {
            sum -= records.pop();
        }
        else {
            let num = parseInt(operation, 10)
            records.push(num);
            sum += num;
        }
    }

    return sum;
};