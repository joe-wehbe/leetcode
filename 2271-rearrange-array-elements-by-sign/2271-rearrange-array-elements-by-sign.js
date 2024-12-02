/**
 * @param {number[]} nums
 * @return {number[]}
 */
var rearrangeArray = function(nums) {
    let positive = [];
    let negative = [];
    let result = [];

    for(const num of nums) {
        num > 0 ? positive.push(num) : negative.push(num);
    }

    for(let i = 0; i < positive.length; i++) {
        result.push(positive[i]);
        result.push(negative[i]);
    }

    return result;
};