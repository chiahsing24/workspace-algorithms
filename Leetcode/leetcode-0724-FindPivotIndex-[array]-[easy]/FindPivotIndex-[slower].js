/**
 * @param {number[]} nums
 * @return {number}
 */
var pivotIndex = function (nums) {
    if (nums === null || nums.length === 0) {
        return -1;
    }

    let leftSum = 0;
    let total = nums.reduce((prevValue, curValue) => prevValue + curValue);
    for (let i = 0; i < nums.length; i++) {
        let rightSum = 0;
        for (let j = i + 1; j < nums.length; j++) {
            rightSum += nums[j];
        }
        if (leftSum === rightSum) {
            return i;
        }
        leftSum += nums[i];
    }

    return -1;
};
