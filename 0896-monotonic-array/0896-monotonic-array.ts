function isMonotonic(nums: number[]): boolean {
    
    let increasing: boolean = true;
    let decreasing: boolean = true;
    
    for (let i = 0; i < nums.length - 1; i++) {
        if (nums[i] > nums[i+1]) {
            increasing = false;
        }
        
        if (nums[i] < nums[i+1]){
            decreasing = false;
        }
    }
    return increasing || decreasing;    
};