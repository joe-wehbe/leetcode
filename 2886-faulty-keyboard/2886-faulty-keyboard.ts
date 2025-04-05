function finalString(s: string): string {
    let result: string[] = [];
    let reversed = false;

    for (const ch of s) ch === 'i' ? reversed = !reversed : reversed ? result.unshift(ch) : result.push(ch)
    if (reversed) result.reverse();

    return result.join('');
};