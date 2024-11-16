function resultsArray(nums: number[], k: number): number[] {
    let result: number[] = [];
    let start = 0;
    let end = k;
    
    while (end <= nums.length) {
        let subarray = nums.slice(start, end);
        console.log(subarray);
        isSortedAndConsecutive(subarray) ? result.push(Math.max(...subarray)) : result.push(-1);
        start++;
        end++;
    }

    return result;
};

function isSortedAndConsecutive(nums: number[]): boolean {
    for(let i = 0; i < nums.length - 1; i++) {
        if(nums[i] + 1 != nums[i+1]) return false;
    }
    return true;
}