function primeSubOperation(nums: number[]): boolean {
    if(isSorted(nums)) return true;

    for(let i = 0; i < nums.length; i++) {
        nums[i] -= highestPrime(nums[i], i == 0 ? 0 : nums[i-1]);
        console.log(nums);
        if(isSorted(nums)) return true;
    }

    return false;
};

function highestPrime(num: number, k): number {
    for(let i = num - 1; i > 0; i--) {
        if (isPrime(i) && num - i > k) return i;
    }
    return 0;
}

function isPrime(num: number): boolean {
    if (num <= 1) return false;
    if (num == 2) return true;
    if (num % 2 == 0) return false;
    
    for(let i = 3; i <= Math.sqrt(num); i += 2) {
        if (num % i === 0) return false 
    }
    return true;
}

function isSorted(nums: number[]): boolean {
    for(let i = 0; i < nums.length - 1; i++) {
        if(nums[i] >= nums[i + 1]) return false;
    }
    return true;
}