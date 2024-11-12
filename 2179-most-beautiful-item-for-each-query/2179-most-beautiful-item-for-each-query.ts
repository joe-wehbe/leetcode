function maximumBeauty(items: number[][], queries: number[]): number[] {
    items.sort((a, b) => a[0] - b[0]);

    let maxBeautyUpToPrice: number[] = [];
    let currentMaxBeauty = 0;
    for (let item of items) {
        currentMaxBeauty = Math.max(currentMaxBeauty, item[1]);
        maxBeautyUpToPrice.push(currentMaxBeauty);
    }

    let prices = items.map(item => item[0]);
    let answer: number[] = [];
    for (let query of queries) {
        let index = binarySearch(prices, query);
        index === -1 ? answer.push(0) : answer.push(maxBeautyUpToPrice[index]);
    }
    return answer;
}

function binarySearch(arr: number[], target: number): number {
    let first = 0, last = arr.length - 1;
    let result = -1;

    while (first <= last) {
        let mid = Math.floor((first + last) / 2);
        arr[mid] <= target ? (result = mid, first = mid + 1) : last = mid - 1;
    }
    return result;
}