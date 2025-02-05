function areAlmostEqual(s1: string, s2: string): boolean {    
    let unequal = 0;
    let set: Set<string> = new Set();
    let arr: string[] = [];

    for (let i = 0; i < s1.length; i++) {
        if (s1[i] != s2[i]) {
            unequal++;
            set.add(s1[i]);
            arr.push(s2[i]);
        }
    }

    if (unequal != 0 && unequal != 2) return false;

    for (let i = 0; i < arr.length; i++) {
        if (!set.has(arr[i])) return false;
    }

    return true;
};