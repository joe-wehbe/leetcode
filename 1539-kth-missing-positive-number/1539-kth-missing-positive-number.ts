function findKthPositive(arr: number[], k: number): number {
    
    let set = new Set(arr);
    let num = 1;
    
    while (k > 0) {
        if(!set.has(num)) {
            k--;
        }
        num++;
    }
    
    return num - 1;
};