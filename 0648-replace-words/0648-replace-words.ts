function replaceWords(dictionary: string[], sentence: string): string {  
    let sentenceArr = sentence.split(' ');
    let set = new Set(dictionary);
    
    for(let i = 0; i < sentenceArr.length; i++) {      
        let j = 1;
        while(j < sentenceArr[i].length && !set.has(sentenceArr[i].substring(0, j))) {
            j++;
        }    
        sentenceArr[i] = sentenceArr[i].substring(0, j);
    } 
    return sentenceArr.join(' ');
};