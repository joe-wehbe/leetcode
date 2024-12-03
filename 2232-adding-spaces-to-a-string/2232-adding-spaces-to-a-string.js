/**
 * @param {string} s
 * @param {number[]} spaces
 * @return {string}
 */
var addSpaces = function(s, spaces) {
    let result = [];
    let count = 0;
    let set = new Set(spaces);

    for(let i = 0; i < s.length; i++) {
        if(set.has(i)) {
            result.push(' ');
        }
        result.push(s[i]);
    }

    return result.join('');
};