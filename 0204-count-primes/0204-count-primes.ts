function countPrimes(n: number): number {
    let count = 0;
    
    for(let i = 1; i < n; i++){
        if(isPrime(i)) count++;
    }
    
    return count;
};

function isPrime(n: number): boolean {
    
    if (n <= 1) return false;
    if (n == 2) return true;
    if (n % 2 == 0) return false;
    
    for(let i = 3; i <= Math.sqrt(n); i += 2) {
        if (n % i === 0) return false 
    }
    return true;
}