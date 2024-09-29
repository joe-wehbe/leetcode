function arraySign(nums: number[]): number {
    
    let product = 1;
    
    for(let i = 0; i < nums.length; i++){
        product *= nums[i];
    }
    
    if(product > 0){
        return 1;
    }
    else if (product < 0){
        return -1;
    }
    else {
        return 0;
    }
};