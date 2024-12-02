/**
 * @param {string} s
 * @return {number}
 */
var secondHighest = function(s) {
    let arr = s.split('').filter(char => !isNaN(char) && char !== ' ').map(Number);
    arr.sort((a, b) => a - b);

    for(let i = arr.length - 2; i >= 0; i--) {
        if(arr[i] < arr[i + 1]) return arr[i];
    }
    return -1;
};