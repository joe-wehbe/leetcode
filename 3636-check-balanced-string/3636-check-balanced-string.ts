function isBalanced(num: string): boolean {
    let digits = num.split('').map(Number);
    let even = 0;
    let odd = 0;

    for (let i = 0; i < digits.length; i++) {
        i % 2 === 0 ? even += digits[i] : odd += digits[i];
    }

    return even === odd;
};