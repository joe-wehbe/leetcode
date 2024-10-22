function minNumber(nums1: number[], nums2: number[]): number {
    
    const setNums1: Set<number> = new Set(nums1);
    const setNums2: Set<number> = new Set(nums2);
    
    for(let i = 1; i <= 9; i++) {
        if(setNums1.has(i) && setNums2.has(i)) return i;
    }
    
    let minNum1 = Math.min(...nums1);
    let minNum2 = Math.min(...nums2);
    
    return Math.min(minNum1, minNum2) * 10 + Math.max(minNum1, minNum2);
};