function maxChunksToSorted(arr: number[]): number {
    let max = -1;
    let chunks = 0;

    for (let i = 0; i < arr.length; i++) {
        max = Math.max(max, arr[i]);  
        if(max == i) chunks++;
    }

    return chunks;
};