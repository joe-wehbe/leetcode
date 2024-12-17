function repeatLimitedString(s: string, repeatLimit: number): string {
    const sorted = s.split('').sort().reverse();

    let map: Map<string, number> = new Map();
    for(const char of sorted) {
        map.has(char) ? map.set(char, map.get(char) + 1) : map.set(char, 1);
    }

    let repeatLimitedString: string[] = [];
    const entries = Array.from(map.entries());
    for(let i = 0; i < entries.length; i++) {
        let k = repeatLimit;
        while(entries[i][1] > 0 && k > 0) {
            repeatLimitedString.push(entries[i][0]);
            entries[i][1]--;
            k--;

            if (entries[i][1] > 0 && k === 0 && i + 1 < entries.length) {
                let j = i;
                while(j + 1 < entries.length && entries[j+1][1] == 0) j++;

                if(j + 1 < entries.length) {
                    repeatLimitedString.push(entries[j + 1][0]);
                    entries[j+1][1]--;
                    k = repeatLimit;
                }
            }
        }
        k = repeatLimit;
    }

    return repeatLimitedString.join('');
}