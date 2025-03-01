function applyOperations(nums: number[]): number[] {
    let insertPos = 0;

    for (let i = 0; i < nums.length - 1; i++) {
        if (nums[i] === nums[i + 1]) {
            nums[i] *= 2;
            nums[i + 1] = 0;
        }
    }

    for (let i = 0; i < nums.length; i++) {
        if (nums[i] !== 0) {
            nums[insertPos++] = nums[i];
        }
    }

    while (insertPos < nums.length) {
        nums[insertPos++] = 0;
    }

    return nums;
}