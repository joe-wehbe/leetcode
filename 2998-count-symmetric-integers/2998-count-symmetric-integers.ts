function countSymmetricIntegers(low: number, high: number): number {
    let count = 0;

    for (let i = low; i <= high; i++) {
        if (isSymmetric(i)) count++;
    }

    return count;
};

function isSymmetric(num: number): boolean {
  const str = num.toString();
  if (str.length % 2 !== 0) return false;

  const firstHalf = str.slice(0, str.length / 2);
  const secondHalf = str.slice(str.length / 2);
  const sum = (s: string) => [...s].reduce((acc, digit) => acc + +digit, 0);

  return sum(firstHalf) === sum(secondHalf);
}