function minAddToMakeValid(s: string): number {
    
    let openCount = 0;
    let closeCount = 0;
    
    for(let i = 0; i < s.length; i++) {
        if(s[i] == '(') {
            openCount++;
        }
        if(s[i] == ')') {
            openCount > 0 ? openCount-- : closeCount++;
        }
    }
    
    return openCount + closeCount;
};