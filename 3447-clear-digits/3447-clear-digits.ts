function clearDigits(s: string): string {
    let stack: string[] = [];

    for (let i = 0; i < s.length; i++) {
        isNaN(parseInt(s[i])) ? stack.push(s[i]) : stack.pop();
    }

    return stack.join('');
};
