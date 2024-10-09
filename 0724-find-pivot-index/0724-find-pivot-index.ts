function pivotIndex(nums: number[]): number {
    
    let totalSum = 0;
    let leftSideSum = 0;

    for(let i = 0; i < nums.length; i++){
        totalSum += nums[i];
    }

    for (let i = 0; i < nums.length; i++) {
        if (leftSideSum === totalSum - leftSideSum - nums[i]) {
            return i;
        }
        leftSideSum += nums[i];
    }

    return -1;
}
