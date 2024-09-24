function thirdMax(nums: number[]): number {
    
    nums.sort((a, b) => b - a)
    const uniqueNums: number[] = [...new Set(nums)];

    return uniqueNums.length > 2 ? uniqueNums[2] : uniqueNums[0];
};