function decrypt(code: number[], k: number): number[] {
    if (k === 0) return code.fill(0);

    let n = code.length;
    code = code.concat(code);

    if (k > 0) {
        for(let i = 0; i < n; i++) {
            let sum = 0;
            for(let j = i + 1; j <= i + k; j++) sum += code[j];
            code[i] = sum;
        }
        return code.slice(0, n);
    }

    if (k < 0) {
        k = -k;
        for(let i = code.length - 1; i >= n; i--) {
            let sum = 0;
            for(let j = i - 1; j >= i - k; j--) sum += code[j];
            code[i] = sum;
        }
        return code.slice(n, code.length);
    }
}