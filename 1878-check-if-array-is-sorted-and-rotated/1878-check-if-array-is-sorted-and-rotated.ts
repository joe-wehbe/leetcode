function check(nums: number[]): boolean {
    let start = 1;
    while(nums[start] >= nums[start - 1]) start++;
    nums = nums.concat(nums.slice(0, start));
    return isSorted(nums.slice(start, nums.length));
};

function isSorted(nums: number[]): boolean {
    for(let i = 0; i < nums.length; i++){
        if(nums[i] > nums[i + 1]) return false;
    }
    return true;
}