function halvesAreAlike(s: string): boolean {
    let vowels: Set<string> = new Set(['a', 'e', 'i', 'o', 'u', 'A', 'E', 'I', 'O', 'U']);
    let left = 0;
    let right = 0;

    for (let i = 0; i < s.length / 2; i++) {
        if (vowels.has(s[i])) left++
        if (vowels.has(s[i + s.length / 2])) right++
    }

    return left === right;
};