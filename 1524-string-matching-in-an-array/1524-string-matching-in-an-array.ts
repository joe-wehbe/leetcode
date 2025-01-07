function stringMatching(words: string[]): string[] {
    let answer: string[] = [];

    for(let i = 0; i < words.length; i++) {
        for(let j = 0; j < words.length; j++) {
            if (words[j].includes(words[i]) && j !== i){
                answer.push(words[i]);
                break;
            }
        }
    }

    return answer;
};