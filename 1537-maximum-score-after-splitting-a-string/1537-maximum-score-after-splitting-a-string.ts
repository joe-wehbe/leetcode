function maxScore(s: string): number {
    let oneCount = 0;
    let zeroCount = 0;
    let score = 0;

    for (let i = 0; i < s.length; i++) {
        if (s[i] === '1') oneCount++;
    }

    for (let i = 0; i < s.length - 1; i++){
        s[i] === '1' ? oneCount-- : zeroCount++;
        score = Math.max(score, zeroCount + oneCount);
    }

    return score;
};