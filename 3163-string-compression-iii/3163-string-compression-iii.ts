function compressedString(word: string): string {
    let comp: string[] = [];
    let i = 0;
    
    while (i < word.length) {
        let count = 1;
        
        while (i + 1 < word.length && word[i] === word[i + 1] && count < 9) {
            count++;
            i++;
        }
        
        comp.push(count.toString());
        comp.push(word[i]);
        i++;
    }
    return comp.join('');
}