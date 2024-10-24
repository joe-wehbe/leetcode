function maximizeSum(nums: number[], k: number): number {
    
    let sum = Math.max(...nums);
    let count = sum;
    
    while (k > 1) {
        sum += count + 1;
        count++;
        k--;
    }
    
    return sum;
};