function minOperations(boxes: string): number[] {
    let answer: number[] = [];

    for(let i = 0; i < boxes.length; i++) {
        let operations = 0;

        for(let j = 0; j < boxes.length; j++) {
            if(boxes[j] === '1') {
                operations += Math.abs(j - i);
            }
        }

        answer.push(operations);
    }

    return answer;
}
