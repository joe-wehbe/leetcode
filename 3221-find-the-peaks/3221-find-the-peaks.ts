function findPeaks(mountain: number[]): number[] {
    let result: number[] = [];
    let n = mountain.length;

    for (let i = 1; i < mountain.length - 1; i++) {
        if (mountain[i] > mountain[i-1] && mountain[i] > mountain[i+1]) {
            result.push(i);
        }
    }

    return result;
};