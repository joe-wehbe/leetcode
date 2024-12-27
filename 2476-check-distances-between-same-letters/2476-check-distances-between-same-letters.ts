function checkDistances(s: string, distance: number[]): boolean {
    let map: Map<string, number> = new Map();

    for(let i = 0; i < s.length; i++) {
        map.has(s[i]) ? map.set(s[i], i - map.get(s[i]) - 1) : map.set(s[i], i);
    }

    for(const [key, value] of map) {
        if(value !== distance[key.charCodeAt(0) - 97]) return false;
    }

    return true;
};