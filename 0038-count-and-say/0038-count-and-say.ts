function countAndSay(n: number): string {
    let result = "1";

    for (let i = 2; i <= n; i++) {
        result = rle(result);
    }

    return result;
};

function rle(str: string): string {
    let count = 1;
    let compressed: string[] = [];

    for (let i = 0; i < str.length; i++) {
        if (str[i] == str[i+1]) {
            count++;
        }
        else {
            compressed.push(count.toString());
            compressed.push(str[i]);
            count = 1;
        }
    }
    
    return compressed.join('');
}