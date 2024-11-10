function minimumSubarrayLength(nums: number[], k: number): number {
    let map: Map<number, number> = new Map();
    let ans: number = Infinity;

    for (let r = 0; r < nums.length; r++) {
        let x = nums[r];
        let newSuffix: Map<number, number> = new Map();

        for (let [val, l] of map) {
            newSuffix.set(val | x, l);
        }
        newSuffix.set(x, r);

        for (let [val, l] of newSuffix) {
            if (val >= k) {
                ans = Math.min(ans, r - l + 1);
            }
        }

        map = newSuffix;
    }

    return ans === Infinity ? -1 : ans;
}
