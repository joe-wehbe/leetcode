function numberOfAlternatingGroups(colors: number[]): number {
    let n = colors.length -1;
    let result = 0;

    if (colors[0] != colors[1] && colors[0] != colors[n]) result++;
    if (colors[n] != colors[n-1] && colors[n] != colors[0]) result++;

    for (let i = 1; i < n; i++) {
        if (colors[i-1] != colors[i] && colors[i] != colors[i+1]) result++;
    }

    return result;
};