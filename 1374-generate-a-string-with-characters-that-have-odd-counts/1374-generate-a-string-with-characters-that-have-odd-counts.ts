function generateTheString(n: number): string {
    
    let charArray: string[] = [];
    
    if(n == 1){
        return "x";
    }
    
    if(n % 2 != 0) {
        charArray.push('z');
        n--;
    }
    
    for(let i = 0; i < n - 1; i++) {
        charArray.push('x');
    }   
    charArray.push('y');

    
    return charArray.join('');
};