function countDistinctIntegers(nums: number[]): number {
    let set: Set<number> = new Set();

    for (const num of nums) {
        set.add(num);
        set.add(reverse(num));
    }

    return set.size;
};

function reverse(num: number): number {
  let reversed = 0;

  while (num !== 0) {
    const digit = num % 10;
    reversed = reversed * 10 + digit;
    num = Math.floor(num / 10);
  }

  return reversed;
}