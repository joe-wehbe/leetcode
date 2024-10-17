function addToArrayForm(num: number[], k: number): number[] {
    let i = num.length - 1;
    
    while (i >= 0 || k > 0) {
        if (i >= 0) {
            k += num[i];
            num[i] = k % 10;
        } else {
            num.unshift(k % 10);
        }
        
        k = Math.floor(k / 10);
        i--;
    }
    
    return num;
}
