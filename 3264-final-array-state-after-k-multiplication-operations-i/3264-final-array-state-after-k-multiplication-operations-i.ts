function getFinalState(nums: number[], k: number, multiplier: number): number[] {
    
    while(k > 0){
        nums[nums.indexOf(Math.min(...nums))] *= multiplier;
        k--;
    }
    return nums;
};