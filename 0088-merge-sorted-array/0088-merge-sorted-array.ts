/**
 Do not return anything, modify nums1 in-place instead.
 */
function merge(nums1: number[], m: number, nums2: number[], n: number): void {
    
    for(let i = 0; i < nums2.length; i++){
        nums1[nums1.length - 1 - i] = nums2[i];
    }
    
    nums1.sort((a, b) => a - b);
};