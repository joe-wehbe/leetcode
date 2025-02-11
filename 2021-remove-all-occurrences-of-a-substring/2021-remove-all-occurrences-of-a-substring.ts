function removeOccurrences(s: string, part: string): string {
    let stack: string[] = [];

    for (let i = 0; i < s.length; i++) {
        stack.push(s[i]);

        if (stack.join('').substring(stack.length - part.length) === part) {
            let n = part.length;
            while (n > 0) {
                stack.pop();
                n--;
            }
        }
    }

    return stack.join('');
};
