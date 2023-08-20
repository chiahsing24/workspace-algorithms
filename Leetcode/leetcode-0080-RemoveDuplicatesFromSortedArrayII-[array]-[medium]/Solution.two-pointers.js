/**
 * @param {number[]} nums
 * @return {number}
 */
var removeDuplicates = function (nums) {
  let curVal = "unknown";
  let cnt = 0;
  let i = 0,
    j = 0;
  while (i < nums.length) {
    if (nums[i] !== curVal) {
      curVal = nums[i];
      cnt = 1;
      nums[j] = nums[i];
      j++;
    } else if (nums[i] === curVal && cnt < 2) {
      cnt++;
      nums[j] = nums[i];
      j++;
    }

    i++;
  }

  return j;
};
