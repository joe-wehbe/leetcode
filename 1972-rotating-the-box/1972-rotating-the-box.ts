function rotateTheBox(box: string[][]): string[][] {
    let rotatedBox: string[][] = [];
    for(let i = 0; i < box[0].length; i++) {
        const row: string[] = [];
        for(let j = box.length - 1; j >= 0; j--) row.push(box[j][i]);
        rotatedBox.push(row);
    }

    for(let j = 0; j < rotatedBox[0].length; j++) {
        for(let i = rotatedBox.length - 1; i >= 0; i--) {
            if(rotatedBox[i][j] == '#') {
                let k = i;
                while(k + 1 < rotatedBox.length && rotatedBox[k + 1][j] == '.') k++;
                rotatedBox[i][j] = '.';
                rotatedBox[k][j] = '#';
            }
        }
    }

    return rotatedBox;
};