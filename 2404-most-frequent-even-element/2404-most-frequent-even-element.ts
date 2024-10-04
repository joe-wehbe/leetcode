function mostFrequentEven(nums: number[]): number {
    
    let map = new Map<number, number>();
    
    for(const num of nums){
        if(num % 2 == 0){
            map.has(num) ? map.set(num, map.get(num) + 1) : map.set(num, 1);           
        }
    }
    
    if(map.size == 0) {
        return -1;
    }

    let maxFrequency = 0;
    let maxFrequencyNum = 0;
    
    for(const [key, value] of map) {
        if(value > maxFrequency) {
            maxFrequency = value;
            maxFrequencyNum = key;
        }
        else if(value == maxFrequency) {
            maxFrequencyNum = Math.min(maxFrequencyNum, key);
        }
    }
    
    return maxFrequencyNum;
};