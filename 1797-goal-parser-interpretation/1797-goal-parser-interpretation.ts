function interpret(command: string): string {
    let result: string[] = [];

    for (let i = 0; i < command.length; i++) {
        if (command[i] === 'G') {
            result.push('G');
        } 
        else {
            if (command[i] === '(' && command[i+1] === ')') {
                result.push('o');
                i++;
            }
            else if (command[i] === '(' && command[i+1] === 'a') {
                result.push('al');
                i += 3;
            }
        }
    }

    return result.join('');
};