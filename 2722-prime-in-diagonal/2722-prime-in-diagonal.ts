function diagonalPrime(nums: number[][]): number {
    let max = 0;
    let j = 0;
    let k = nums.length - 1;

    for (let i = 0; i < nums.length; i++) {
        let num1 = nums[i][j]
        let num2 = nums[i][k];
        if (num1 > max && isPrime(num1)) max = num1;
        if (num2 > max && isPrime(num2)) max = num2;
        j++;
        k--;
    }

    return max;
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