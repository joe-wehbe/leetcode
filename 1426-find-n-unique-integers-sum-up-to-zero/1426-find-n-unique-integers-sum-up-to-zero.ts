function sumZero(n: number): number[] {
    let result: number[] = [];
    let num = 1;
    let count = 0;

    if (n % 2 !== 0) {
        result.push(0); 
        count++;
    }

    while (count < n) {
        result.push(num);
        result.push(-num);
        count += 2;
        num++;
    }

    return result;
};