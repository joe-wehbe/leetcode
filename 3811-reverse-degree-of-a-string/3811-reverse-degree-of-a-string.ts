function reverseDegree(s: string): number {
    let degree = 0;

    for (let i = 0; i < s.length; i++) {
        degree += (26 - (s[i].charCodeAt(0) - 97)) * (i + 1);
    }

    return degree;
};