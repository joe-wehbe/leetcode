function closestPrimes(left: number, right: number): number[] {
    let prime: number[] = [];
    let minGap: number = Infinity;
    let result: number[] = new Array(2).fill(-1);

    for (let i = left; i <= right; i++) {
        if (isPrime(i)) {
            prime.push(i);

            if (prime.length >= 2) {
                let gap = prime[prime.length-1] - prime[prime.length-2];

                if (gap < minGap) {
                    minGap = gap;
                    result = [prime[prime.length-2], prime[prime.length-1]];
                }
            }
        }
    }

    return result;
};

function isPrime(n: number): boolean {
    if (n <= 1) return false;
    if (n == 2) return true;
    if (n % 2 == 0) return false;
    
    const sqrt = Math.sqrt(n);
    for(let i = 3; i <= sqrt; i += 2) {
        if (n % i === 0) return false 
    }

    return true;
}