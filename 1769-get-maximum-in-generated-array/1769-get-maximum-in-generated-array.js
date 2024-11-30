/**
 * @param {number} n
 * @return {number}
 */
var getMaximumGenerated = function(n) {
    if(n == 0) return 0;

    let result = new Array(n + 1);
    result[0] = 0;
    result[1] = 1;

    for(let i = 1; i < result.length; i++) {
        if(2 * i >= 2 && 2 * i <= n) {
            result[2 * i] = result[i];
        }
        if(2 * i + 1 >= 2 && 2 * i + 1 <= n) {
            result[2 * i + 1] = result[i] + result[i + 1];
        }
    }

    return Math.max(...result);
};