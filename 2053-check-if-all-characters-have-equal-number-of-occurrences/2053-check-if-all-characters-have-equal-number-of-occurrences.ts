function areOccurrencesEqual(s: string): boolean {
    let map: Map<string, number> = new Map();
    let prevfreq: number = -1;

    for (let i = 0; i < s.length; i++) {
        map.has(s[i]) ? map.set(s[i], map.get(s[i]) + 1) : map.set(s[i], 1);
    }

    for (const [letter, freq] of map) {
        if (prevfreq != -1 && prevfreq != freq) return false;
        prevfreq = freq;
    }

    return true;
};