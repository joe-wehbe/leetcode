function maxWidthRamp(nums: number[]): number {
    
    let maxRamp = 0;
    let stack: number[] = [];
    
    for(let i = 0; i < nums.length; i++) {
        if(stack.length == 0 || nums[stack[stack.length - 1]] > nums[i]){
            stack.push(i);
        }
    }
    
    for(let j = nums.length - 1; j >= 0; j--) {
        while(stack.length > 0 && nums[stack[stack.length - 1]] <= nums[j]){
            maxRamp = Math.max(maxRamp, j - stack.pop());
        }   
    }
    
    return maxRamp;
};