/**
 * @param {number[]} nums
 * @param {number[][]} queries
 * @return {number[]}
 */
var sumEvenAfterQueries = function(nums, queries) {
    let sumEven = 0;
    for(const num of nums){
        if(isEven(num)) sumEven += num;
    }

    let result = [];
    for(const query of queries) {
        let beforeQuery = nums[query[1]];
        let afterQuery = beforeQuery + query[0];
        nums[query[1]] += query[0];

        if(isEven(beforeQuery) && isEven(afterQuery)) sumEven += query[0];
        if(isEven(beforeQuery) && !isEven(afterQuery)) sumEven -= beforeQuery;
        if(!isEven(beforeQuery) && isEven(afterQuery)) sumEven += afterQuery;

        result.push(sumEven);
    }

    return result;
};

var isEven = function(num) {
    return num % 2 == 0;
}