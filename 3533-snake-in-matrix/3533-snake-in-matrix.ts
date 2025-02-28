function finalPositionOfSnake(n: number, commands: string[]): number {
    let position = 0;

    for (const command of commands) {
        if (command == "RIGHT") position += 1;
        else if (command == "LEFT") position -= 1;
        else if (command == "DOWN") position += n;
        else if (command == "UP") position -= n;
    }

    return position;
};