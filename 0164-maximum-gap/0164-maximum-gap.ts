function maximumGap(nums: number[]): number {
    
    nums.sort((a, b) => a - b);
    
    let maxDifference = 0;
    
    for(let i = 0; i < nums.length - 1; i++) {
        maxDifference = Math.max(maxDifference, Math.abs(nums[i] - nums[i+1]));
    }
    
    return maxDifference;
};