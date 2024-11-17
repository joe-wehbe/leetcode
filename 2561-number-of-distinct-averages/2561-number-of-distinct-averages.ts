function distinctAverages(nums: number[]): number {
    nums.sort((a, b) => a - b);

    let set: Set<number> = new Set();
    let left = 0;
    let right = nums.length - 1;

    while(left < right) {
        set.add((nums[left] + nums[right]) / 2);
        left++;
        right--;
    }

    return set.size;
};