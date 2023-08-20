/**
 * @param {number[]} nums
 * @return {number}
 */
var removeDuplicates = function (nums) {
  let i = 0,
    j = 0;
  let curVal = "unknown";
  while (i < nums.length) {
    if (nums[i] !== curVal) {
      curVal = nums[i];
      nums[j] = nums[i];
      j++;
    }

    i++;
  }

  return j;
};
