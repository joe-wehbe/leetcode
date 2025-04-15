function reverseOnlyLetters(s: string): string {
    let i = 0;
    let j = s.length - 1;
    let result: string[] = s.split('');

    while (i < j) {
        if (isLetter(s[i])) {
            while (!isLetter(s[j])) j--;
            let temp = result[i];
            result[i] = result[j]
            result[j] = temp;
            j--;
        }
        i++;
    }

    return result.join('');
}

function isLetter(s: string): boolean {
    return (s >= 'a' && s <= 'z') || (s >= 'A' && s <='Z');
}