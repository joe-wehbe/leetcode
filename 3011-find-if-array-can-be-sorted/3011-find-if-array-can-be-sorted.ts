function canSortArray(nums: number[]): boolean {  
    
    let setBitsArray: number[] = [];
    for(const num of nums) {
        setBitsArray.push(num.toString(2).split('1').length - 1);
    }
    
    let segments: number[][] = [];
    let currentSegment: number[] = []; 
    for(let i = 0; i < nums.length; i++) {
        if(currentSegment.length == 0) {
            currentSegment.push(nums[i]);
        }
        else {
            if(setBitsArray[i] == setBitsArray[i-1]) {
                currentSegment.push(nums[i]);
            }
            else {
                segments.push(currentSegment);
                currentSegment = [nums[i]];
            }
        }
    }
    
    if(currentSegment.length > 0) {
        segments.push(currentSegment);
    }
        
    for(let i = 0; i < segments.length - 1; i++) {
        if(Math.max(...segments[i]) > Math.min(...segments[i + 1])) return false;
    }
       
    return true;
}

