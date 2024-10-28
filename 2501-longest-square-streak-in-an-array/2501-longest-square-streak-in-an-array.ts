function longestSquareStreak(nums: number[]): number {   
    let maxSquareStreak = 0;
    let set = new Set(nums);
    nums.sort((a, b) => a - b);
    
    for(let i = 0; i < nums.length; i++) {
        let count = 0;
        let square = nums[i];
        
        while(set.has(square)) {
            square *= square;
            count++
        }
    
        maxSquareStreak = Math.max(maxSquareStreak, count);
    }
    return maxSquareStreak == 1 ? -1 : maxSquareStreak;
};