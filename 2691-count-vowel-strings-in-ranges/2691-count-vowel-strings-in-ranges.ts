function vowelStrings(words: string[], queries: number[][]): number[] {
    let vowels: Set<string> = new Set(["a", "e", "i", "o", "u"]);
    let prefixSum: number[] = [];
    let count = 0;

    for (const word of words) {
        if (vowels.has(word[0]) && vowels.has(word[word.length - 1])) count++;
        prefixSum.push(count);
    }

    let ans: number[] = [];

    for (const [start, end] of queries) {
        ans.push(prefixSum[end] - (start > 0 ? prefixSum[start - 1] : 0));
    }

    return ans;
};

