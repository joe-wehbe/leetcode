function minimumAverage(nums: number[]): number {    
    let min = 0;
    let max = nums.length - 1;
    let minAverage = 51;

    nums.sort((a, b) => a-b);

    while (min < max) {
        let average = (nums[min] + nums[max]) / 2;
        minAverage = Math.min(minAverage, average);
        min++;
        max--;
    }

    return minAverage;
};