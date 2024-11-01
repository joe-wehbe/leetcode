function makeFancyString(s: string): string {
    
    let result: string[] = [];
    result.push(s[0]);
    result.push(s[1]);
        
    for(let i = 2; i < s.length; i++) {
        if(s[i - 2] != s[i] || s[i - 1] != s[i]) {
            result.push(s[i]);
        }
    }
    
    return result.join('');  
};