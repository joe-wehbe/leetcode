function countUnguarded(m: number, n: number, guards: number[][], walls: number[][]): number {
    const wallsSet = new Set<string>();
    const guardsSet = new Set<string>();
    const guarded = new Set<string>();
    
    for (const wall of walls) wallsSet.add(`${wall[0]},${wall[1]}`);
    for (const guard of guards) guardsSet.add(`${guard[0]},${guard[1]}`);

    const directions: number[][] = [[-1, 0], [1, 0], [0, -1], [0, 1],];
    
    for (const guard of guards) {
        const [r, c] = guard;
        
        for (const dir of directions) {
            let x = r, y = c;
            
            while (true) {
                x += dir[0];
                y += dir[1];
                
                if (x < 0 || x >= m || y < 0 || y >= n) break;
                if (wallsSet.has(`${x},${y}`) || guardsSet.has(`${x},${y}`)) break;
                
                guarded.add(`${x},${y}`);
            }
        }
    }

    let unguardedCount = 0;    
    for (let i = 0; i < m; i++) {
        for (let j = 0; j < n; j++) {
            const cell = `${i},${j}`;
            if (!wallsSet.has(cell) && !guardsSet.has(cell) && !guarded.has(cell)) unguardedCount++
        }
    }
    
    return unguardedCount;
}
