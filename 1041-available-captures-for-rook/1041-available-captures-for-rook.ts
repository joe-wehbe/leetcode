function numRookCaptures(board: string[][]): number {
    let [i, j] = findRook(board);
    let pawns = 0;

    for (let up = i; up >= 0; up--) {
        if (board[up][j] == "p") {
            pawns++;
            break;
        }
        else if (board[up][j] == "B") {
            break;
        }
    }

    for (let down = i; down < board.length; down++) {
        if (board[down][j] == "p") {
            pawns++;
            break;
        }
        else if (board[down][j] == "B") {
            break;
        }
    }

    for (let left = j; left >= 0; left--) {
        if (board[i][left] == "p") {
            pawns++;
            break;
        }
        else if (board[i][left] == "B") {
            break;
        }
    }

    for (let right = j; right < board.length; right++) {
        if (board[i][right] == "p") {
            pawns++;
            break;
        }
        else if (board[i][right] == "B") {
            break;
        }
    }

    return pawns;
    
};

function findRook(board: string[][]): [number, number] | null {
    for (let i = 0; i < board.length; i++) {
        for (let j = 0; j < board.length; j++) {
            if (board[i][j] == "R") {
                return [i,j];
            } 
        }
    }
    return null;
}