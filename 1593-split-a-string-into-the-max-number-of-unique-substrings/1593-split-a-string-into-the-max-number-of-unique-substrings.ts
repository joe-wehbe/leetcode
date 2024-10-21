function maxUniqueSplit(s: string): number {
    const queue: { start: number; seen: Set<string> }[] = [{ start: 0, seen: new Set<string>() }];
    let maxCount = 0;

    while (queue.length > 0) {
        const { start, seen } = queue.shift()!;

        if (start === s.length) {
            maxCount = Math.max(maxCount, seen.size);
            continue;
        }

        for (let end = start + 1; end <= s.length; end++) {
            const substring = s.substring(start, end);
            if (!seen.has(substring)) {
                const newSeen = new Set(seen);
                newSeen.add(substring);
                queue.push({ start: end, seen: newSeen });
            }
        }
    }

    return maxCount;
}