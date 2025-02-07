function queryResults(limit: number, queries: number[][]): number[] {
    let ballMap: Map<number, number> = new Map();
    let colorCount: Map<number, number> = new Map();
    let result: number[] = [];

    for (const [ball, color] of queries) {
        if (ballMap.has(ball)) {
            let prevColor = ballMap.get(ball)!;
            colorCount.set(prevColor, (colorCount.get(prevColor)! || 0) - 1);

            if (colorCount.get(prevColor) === 0) {
                colorCount.delete(prevColor);
            } 
        }
        ballMap.set(ball, color);
        colorCount.set(color, (colorCount.get(color) || 0) + 1);
        result.push(colorCount.size);
    }

    return result;
}
