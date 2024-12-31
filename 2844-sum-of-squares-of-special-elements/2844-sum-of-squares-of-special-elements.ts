function sumOfSquares(nums: number[]): number {
    let sum = 0;

    for(let i = 1; i <= nums.length; i++) {
        if(nums.length % i === 0) {
            sum += nums[i - 1]**2;
        }
    } 

    return sum;
};