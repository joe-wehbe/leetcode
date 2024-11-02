function isCircularSentence(sentence: string): boolean {
    let sentenceArr = sentence.split(' ');

    for(let i = 0; i < sentenceArr.length - 1; i++) {
        if(sentenceArr[i][sentenceArr[i].length - 1] != sentenceArr[i + 1][0]) return false;
    }

    return sentenceArr[sentenceArr.length - 1][sentenceArr[sentenceArr.length - 1].length - 1] == sentenceArr[0][0] ? true : false;
}