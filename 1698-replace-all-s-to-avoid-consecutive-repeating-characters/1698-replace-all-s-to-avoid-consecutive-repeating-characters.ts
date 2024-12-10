function modifyString(s: string): string {
    let arr = s.split('');

    if(s.length == 1) {
        return s[0] === '?' ? getRandomLetter() : s;
    }

    for(let i = 0; i < arr.length; i++) {
        if(arr[i] === '?') {
            let letter = getRandomLetter();
            if(i == 0) {
                while (letter == arr[i+1]) letter = getRandomLetter();
                arr[i] = letter;
            }

            if(i == arr.length - 1) {
                while (letter == arr[i-1]) letter = getRandomLetter()
                arr[i] = letter;        
            }

            else {
                while (letter == arr[i-1] || letter == arr[i+1]) letter = getRandomLetter();
                arr[i] = letter;  
            }
        }
    }

    return arr.join('');
};

function getRandomLetter(): string {
    return String.fromCharCode(Math.floor(Math.random() * 26) + 97);
}