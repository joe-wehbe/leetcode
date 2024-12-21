function countMatches(items: string[][], ruleKey: string, ruleValue: string): number {
    let match = 0;
    let index = 0;

    if (ruleKey === 'color') index = 1;
    if (ruleKey === 'name') index = 2;

    for (const item of items) {
        if (item[index] === ruleValue) match++
    }

    return match;
};