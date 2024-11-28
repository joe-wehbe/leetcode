function findWords(words: string[]): string[] {
    let row1 = new Set("qwertyuiop");
    let row2 = new Set("asdfghjkl");
    let row3 = new Set("zxcvbnm");
    let result: string[] = [];

    for(const word of words) {
        if (word.split('').every(char => row1.has(char.toLowerCase()))
        || word.split('').every(char => row2.has(char.toLowerCase())) 
        || word.split('').every(char => row3.has(char.toLowerCase()))) {
            result.push(word)
        }
    }

    return result;
};