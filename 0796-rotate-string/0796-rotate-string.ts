function rotateString(s: string, goal: string): boolean {
    return (s + s).includes(goal) && s.length == goal.length;
};