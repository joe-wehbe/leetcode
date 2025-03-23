function sumOfEncryptedInt(nums: number[]): number {
    let sum = 0;

    for (const num of nums) {
        sum += encrypt(num);
    }

    return sum;
};

function encrypt(num: number): number {
    let max = 0;
    let count = 0;
    let encrypted = 0;

    while (num > 0) {
        max = Math.max(max, num % 10);
        num = Math.floor(num / 10);
        count++;
    }

    return parseInt(max.toString().repeat(count));
}