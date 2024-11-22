function uniqueMorseRepresentations(words: string[]): number {
    let set: Set<string> = new Set();
    for (const word of words) set.add(generateMorseCode(word));
    return set.size;
};

function generateMorseCode(word: string): string {
    let arr = word.split('');
    let morseCode: string[] = [".-","-...","-.-.","-..",".","..-.","--.","....","..",
                            ".---","-.-",".-..","--","-.","---",".--.","--.-",".-.",
                            "...","-","..-","...-",".--","-..-","-.--","--.."]

    for(let i = 0; i < arr.length; i++) {
        arr[i] = morseCode[arr[i].charCodeAt(0) - 97];
    }

    return arr.join('');
}