function waysToSplitArray(nums: number[]): number {
    let sum = 0;
    let count = 0;
    let currentSum = 0;

    for(const num of nums) {
        sum += num;
    }

    for(let i = 0; i < nums.length - 1; i++) {
        currentSum += nums[i];
        if(currentSum >= sum - currentSum) {
            count++;
        }
    }

    return count;
};