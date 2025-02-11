function removeOccurrences(s: string, part: string): string {
    let stack: string[] = [];
    let partLen = part.length;

    for (let i = 0; i < s.length; i++) {
        stack.push(s[i]);

        if (stack.length >= partLen && stack.slice(-partLen).join('') === part) {
            stack.length -= partLen;
        }
    }

    return stack.join('');
};
