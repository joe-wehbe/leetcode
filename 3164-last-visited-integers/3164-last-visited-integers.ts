function lastVisitedIntegers(nums: number[]): number[] {
    let seen: number[] = [];
    let ans: number[] = [];
    let k = 0;

    for(const num of nums) {
        if(num > 0) {
            k = 0;
            seen.unshift(num);
        }
        else {
            k++;
            k <= seen.length ? ans.push(seen[k - 1]) : ans.push(-1);
        }
    }
    
    return ans;
}