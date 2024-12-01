/**
 * @param {number[]} arr
 * @return {boolean}
 */
var checkIfExist = function(arr) {
    let set = new Set();

    for (const num of arr) {
        if (num === 0 && set.has(0)) return true;
        if (set.has(num * 2) || set.has(num / 2)) return true;
        set.add(num);
    }

    return false;
};