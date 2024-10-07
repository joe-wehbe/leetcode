function minLength(s: string): number {
    
    const charArray: string[] = s.split('');
    
    for(let i = 0; i < charArray.length; i++) {
        if((charArray[i] == 'A' && charArray[i+1] == 'B') || (charArray[i] == 'C' && charArray[i+1] == 'D')) {
            charArray.splice(i,2);
            i -= 2;
        }
    }
    
    return charArray.length;
};