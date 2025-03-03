function pivotArray(nums: number[], pivot: number): number[] {
    let left: number[] = [];
    let right: number[] = [];
    let pivots: number[] = [];

    for (const num of nums) {
        if (num > pivot) right.push(num);
        else if (num < pivot) left.push(num);
        else pivots.push(num);
    }

    left.push(...pivots, ...right);
    return left;
};