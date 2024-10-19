function findKthBit(n: number, k: number): string {
    
    let binaryArr: string[] = ['0'];
    let i = 1;
    
    while(i < n) {
        binaryArr.push(binaryArr[i-1] + '1' + reverse(invert(binaryArr[i-1])));
        i++;
    }  
    
    return binaryArr[binaryArr.length - 1][k - 1];
};

function invert (binaryStr: string) : string {    
    return binaryStr.split('').map(bit => bit === '0' ? '1' : '0').join('');
}

function reverse(binaryStr: string) : string {
    return binaryStr.split('').reverse().join('');
}