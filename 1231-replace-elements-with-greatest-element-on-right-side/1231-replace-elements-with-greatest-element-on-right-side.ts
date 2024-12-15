function replaceElements(arr: number[]): number[] {
    let max = arr[arr.length - 1];
    arr[arr.length - 1] = -1;

    for(let i = arr.length - 2; i >= 0; i--) {
        let temp = arr[i];
        arr[i] = max;
        max = Math.max(max, temp);
    }

    return arr;
};