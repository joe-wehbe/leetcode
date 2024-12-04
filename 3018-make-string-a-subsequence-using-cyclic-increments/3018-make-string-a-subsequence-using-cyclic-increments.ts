function canMakeSubsequence(str1: string, str2: string): boolean {
    let i = 0;
    let j = 0;

    while (i < str1.length && j < str1.length) {
        str1[i] == str2[j] || increment(str1[i]) == str2[j] ? (i++, j++) : i++;
    }

    return j === str2.length;
};

function increment(str: string): string {
    return str !== 'z' ? String.fromCharCode(str.charCodeAt(0) + 1) : 'a';
}