function countCompleteDayPairs(hours: number[]): number {
    let count = 0;

    for (let i = 1; i < hours.length; i++) {
        for (let j = 0; j < i; j++) {
            if ((hours[i] + hours[j]) % 24 === 0) count++;
        }
    }

    return count;
};