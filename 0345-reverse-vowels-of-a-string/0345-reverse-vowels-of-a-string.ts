function reverseVowels(s: string): string {
    let left = 0;
    let right = s.length - 1;
    let result: string[] = s.split('');
    let set: Set<string> = new Set(['a','e','i','o','u','A','E','I','O','U'])

    while (left < right) {
        if (set.has(result[left])) {
            while (!set.has(result[right])) right--;
            let temp = result[left];
            result[left] = result[right];
            result[right] = temp;
            right--;
        }
        left++;
    }

    return result.join('');
};