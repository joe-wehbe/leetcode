function isAcronym(words: string[], s: string): boolean {
    let firstLetters: string[] = [];

    for (const word of words) {
        firstLetters.push(word[0]);
    }

    return firstLetters.join('') === s;
};