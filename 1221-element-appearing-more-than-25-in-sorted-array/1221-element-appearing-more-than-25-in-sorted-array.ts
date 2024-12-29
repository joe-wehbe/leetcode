function findSpecialInteger(arr: number[]): number {
    let count = 1;
    let maxCount = 1;
    let num = arr[0];

    for(let i = 0; i < arr.length; i++) {
        arr[i] === arr[i+1] ? count++ : count = 1;
        if(count > maxCount) maxCount = count, num = arr[i];
    }

    return num;
};