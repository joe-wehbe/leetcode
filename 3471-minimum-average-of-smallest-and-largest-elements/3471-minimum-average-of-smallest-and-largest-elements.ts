function minimumAverage(nums: number[]): number {    
    let n = nums.length / 2;
    let min = 0;
    let max = nums.length - 1;
    let averages = [];
    let minAverage = 51;

    nums.sort((a, b) => a-b);

    while (n > 0) {
        let average = (nums[min] + nums[max]) / 2;
        averages.push(average);
        minAverage = Math.min(minAverage, average);
        
        n--;
        min++;
        max--;
    }

    return minAverage;
};