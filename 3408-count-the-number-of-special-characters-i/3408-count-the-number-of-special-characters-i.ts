function numberOfSpecialChars(word: string): number {
    let set: Set<string> = new Set(word);
    let count: number = 0;

    for (let i = 65; i <= 90; i++) {
        if (set.has(String.fromCharCode(i)) && set.has(String.fromCharCode(i+32))) count++; 
    }

    return count;
};