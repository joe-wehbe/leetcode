function mergeArrays(nums1: number[][], nums2: number[][]): number[][] {
    const indexMap: Map<number, number> = new Map();

    for (const [index, value] of nums1) {
        indexMap.set(index, (indexMap.get(index) || 0) + value);
    }

    for (const [index, value] of nums2) {
        indexMap.set(index, (indexMap.get(index) || 0) + value);
    }

    const result: [number, number][] = [];
    for (const [index, value] of Array.from(indexMap.entries()).sort(([a], [b]) => a - b)) {
        result.push([index, value]);
    }

    return result;
};