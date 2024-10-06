function minimumOperations(nums: number[]): number {
    
    let uniqueNonZeroElements = new Set<number>();

    for (const num of nums) {
        if (num > 0) {
            uniqueNonZeroElements.add(num);
        }
    }
    
    return uniqueNonZeroElements.size;
}
