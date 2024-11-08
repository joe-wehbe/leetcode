function getMaximumXor(nums: number[], maximumBit: number): number[] {  
    let maxK = Math.pow(2, maximumBit) - 1;
    let totalXor = nums.reduce((acc, curr) => acc ^ curr, 0);
    let result: number[] = [];
    
    while (nums.length > 0) {
        result.push(maxK ^ totalXor);
        totalXor ^= nums.pop()!;
    }
    
    return result;
}
