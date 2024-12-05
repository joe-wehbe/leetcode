function canChange(start: string, target: string): boolean {
    let startNoBlank = start.split('_').filter((char) => char != '').join('');
    let targetNoBlank = target.split('_').filter((char) => char != '').join('');
    if (startNoBlank !== targetNoBlank) return false;

    let startIndexR = 0, targetIndexR = 0;
    while ((startIndexR = start.indexOf('R', startIndexR)) !== -1) {
        targetIndexR = target.indexOf('R', targetIndexR);
        if (startIndexR > targetIndexR) return false;
        startIndexR++;
        targetIndexR++;
    }

    let startIndexL = 0, targetIndexL = 0;
    while ((startIndexL = start.indexOf('L', startIndexL)) !== -1) {
        targetIndexL = target.indexOf('L', targetIndexL);
        if (startIndexL < targetIndexL) return false;
        startIndexL++;
        targetIndexL++;
    }

    return true;
}
