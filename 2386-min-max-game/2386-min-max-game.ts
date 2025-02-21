function minMaxGame(nums: number[]): number {
    while (nums.length > 1) {
        let newNums = new Array(nums.length / 2);

        for (let i = 0; i < newNums.length; i++) {
            i % 2 == 0 ? newNums[i] = Math.min(nums[2*i], nums[2*i+1]) : newNums[i] = Math.max(nums[2*i], nums[2*i+1])
        } 

        nums = newNums;
    }

    return nums[0];
};