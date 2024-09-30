function findClosestNumber(nums: number[]): number {
    let minDistance = Infinity;
    let minNum = 0;
    
    for (const num of nums) {
        if (Math.abs(num) < minDistance) {
            minDistance = Math.abs(num);
            minNum = num;
        } else if (Math.abs(num) == minDistance) {
            if (num > minNum) {
                minNum = num;
            }
        }
    }
    
    return minNum;
}
