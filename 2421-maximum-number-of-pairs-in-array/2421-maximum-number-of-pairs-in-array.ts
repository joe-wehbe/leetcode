function numberOfPairs(nums: number[]): number[] {
    let map: Map<number, number> = new Map();
    let result: number[] = [];

    for (const num of nums){
        map.has(num) ? map.set(num, map.get(num) + 1) : map.set(num, 1);
    }

    let answer1 = 0;
    let answer2 = 0;

    for (const [key, value] of map) {
        answer1 += Math.floor(value / 2);
        answer2 += value % 2;
    }

    return [answer1, answer2];
};