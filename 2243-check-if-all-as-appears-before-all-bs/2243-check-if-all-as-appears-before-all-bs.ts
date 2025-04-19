function checkString(s: string): boolean {
    let check: boolean = false;

    for (let i = 0; i < s.length; i++) {
        if (!check && s[i] === 'b') check = true;
        if (check && s[i] == 'a') return false;
    }

    return true;
};