function countCompleteDayPairs(hours: number[]): number {
    let countMap = new Map<number, number>();
    let result = 0;

    for (const hour of hours) {
        let remainder = hour % 24;
        let complement = (24 - remainder) % 24;

        if (countMap.has(complement)) {
            result += countMap.get(complement)!;
        }

        countMap.set(remainder, (countMap.get(remainder) || 0) + 1);
    }

    return result;
}