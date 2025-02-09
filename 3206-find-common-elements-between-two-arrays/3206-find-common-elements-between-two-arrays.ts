function findIntersectionValues(nums1: number[], nums2: number[]): number[] {
    let set1 = new Set(nums2);
    let answer1 = 0;

    for (const num of nums1) {
        if (set1.has(num)) answer1++;
    }

    let set2 = new Set(nums1);
    let answer2 = 0;

    for (const num of nums2) {
        if (set2.has(num)) answer2++;
    }

    return [answer1, answer2];
};