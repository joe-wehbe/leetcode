function minElement(nums: number[]): number {
    let min = 10**4 + 1;

    for (let i = 0; i < nums.length; i++) {
        nums[i] = sumDigits(nums[i]);
        min = Math.min(min, nums[i]);
    }

    return min;
};

function sumDigits(nums: number): number {
    let sum = 0;

    while (nums > 0) {
        sum += nums % 10;
        nums = Math.floor(nums / 10);
    }

    return sum;
}