function isGood(nums: number[]): boolean {
    
    if(nums.length != Math.max(...nums) + 1){
        return false;
    }
    
    nums.sort((a, b) => a - b);
    
    for(let i = 0; i < nums.length - 2; i++){
        if(nums[i + 1] -1 != nums[i]){
            return false;
        }
    }
    
    if(nums[nums.length - 1] != nums[nums.length - 2]){
        return false;
    }
    
    return true;
};