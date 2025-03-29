function nextGreatestLetter(letters: string[], target: string): string {
    let targetAscii = target.charCodeAt(0);
    let minAscii = 123;

    for (const letter of letters) {
        let letterAscii = letter.charCodeAt(0);

        if (letterAscii > targetAscii) {
            minAscii = Math.min(minAscii, letterAscii);
        }
    }

    return minAscii === 123 ? letters[0] : String.fromCharCode(minAscii);
};