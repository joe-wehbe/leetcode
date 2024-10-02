function arrayRankTransform(arr: number[]): number[] {
    
    let sorted = Array.from(new Set(arr)).sort((a, b) => a - b);
    
    let map = new Map<number, number>();
    for(let i = 0; i < sorted.length; i++){
        map.set(sorted[i], i + 1);
    }
    
    return arr.map(num => map.get(num));
};