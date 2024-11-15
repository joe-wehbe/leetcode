function singleNumber(nums: number[]): number {
    nums.sort((a, b) => a - b);

    for(let i = 0; i < nums.length; i++) {
        if(nums[i] == nums[i+1] && nums[i+1] == nums[i+2]) {
            i += 2;

            if(i == nums.length - 1) return nums[i];
        }
        else {
            return nums[i];
        }
    }
};