function trimMean(arr: number[]): number {
    const toRemove = 0.05 * arr.length;
    return arr.sort((a, b) => a - b)
              .slice(toRemove, arr.length - toRemove) 
              .reduce((acc, curr) => acc += curr, 0) / (arr.length - (toRemove * 2));
};