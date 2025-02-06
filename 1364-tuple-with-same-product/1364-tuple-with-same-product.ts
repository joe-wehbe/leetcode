function tupleSameProduct(nums: number[]): number {
    let map: Map<number, number> = new Map();
    let result = 0;

    for (let i = 0; i < nums.length; i++) {
        for (let j = i + 1; j < nums.length; j++) {
            let product = nums[i] * nums[j];
            map.set(product, (map.get(product) || 0) + 1);
        }
    }

    for (const [product, frequency] of map) {
        if (frequency > 1) {
            result += (frequency * (frequency - 1)) / 2 * 8;
        }
    }

    return result;
};