function countHillValley(nums: number[]): number {
    let array = nums.filter((value, index) => index === 0 || value !== nums[index - 1]);
    let count = 0;

    for (let i = 1; i < array.length - 1; i++) {
        if (array[i] > array[i-1] && array[i] > array[i+1]) count++;
        else if (array[i] < array[i-1] && array[i] < array[i+1]) count++;
    }

    return count;
};