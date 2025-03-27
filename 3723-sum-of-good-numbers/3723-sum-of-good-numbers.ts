function sumOfGoodNumbers(nums: number[], k: number): number {
    let result = 0;
    let n = nums.length;

    for (let i = 0; i < n; i++) {
        let left = false;
        let right = false;
        let l = i - k
        let r = i + k;

        if (l < 0 || (l >= 0 && nums[i] > nums[l])) left = true;
        if (r > n - 1 || (r <= n - 1 && nums[i] > nums[r])) right = true;
        if (left && right) result += nums[i];
    }

    return result;
};