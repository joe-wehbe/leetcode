function repeatedCharacter(s: string): string {
    let set:Set<string> = new Set();

    for (const ch of s) {
        if (set.has(ch)) {
            return ch;
        } else {
            set.add(ch);
        }
    }

    return '';
};