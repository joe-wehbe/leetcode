function canBeIncreasing(nums: number[]): boolean {
    if (isIncreasing(nums) || nums.length === 2) return true;

    for(let i = 0; i < nums.length; i++) {
        const current = [...nums.slice(0, i), ...nums.slice(i + 1, nums.length)];
        if(isIncreasing(current)) return true;
    }

    return false;
};

function isIncreasing(nums: number[]): boolean {
    for(let i = 0; i < nums.length - 1; i++) {
        if (nums[i] >= nums[i + 1]) return false;
    }
    return true;
}