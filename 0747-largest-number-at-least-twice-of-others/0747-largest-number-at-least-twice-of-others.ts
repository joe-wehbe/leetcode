function dominantIndex(nums: number[]): number {
    
    let firstMax = Math.max(...nums);
    let secondMax = Math.max(...nums.filter(num => num !== firstMax));

    return firstMax >= 2 * secondMax ? nums.indexOf(firstMax) : -1;
};