function restoreString(s: string, indices: number[]): string {
    let shuffled: string[] = new Array(s.length);

    for(let i = 0; i < s.length; i++) {
        shuffled[indices[i]] = s[i];
    }

    return shuffled.join('');
};