function minimumRecolors(blocks: string, k: number): number {
    let prefix: number[] = [0];
    let minOps = blocks.length;

    for (let i = 0; i < blocks.length; i++) {
        prefix.push(prefix[i] + (blocks[i] == 'W' ? 1 : 0));
    }

    for (let i = 0; i + k <= blocks.length; i++) {
        minOps = Math.min(minOps, prefix[i + k] - prefix[i]);
    }

    return minOps;
};