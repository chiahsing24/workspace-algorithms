// Case 1:
// [0, 1, 2, 2, 2, 3, 3, 5]
// ------------------------

// Case 2:
// [1, 2, 2, 2, 3, 3, 5, 0]
// [2, 2, 2, 3, 3, 5, 0, 1]
// [2, 2, 3, 3, 5, 0, 1, 2]
// [2, 3, 3, 5, 0, 1, 2, 2]
// ------------------------

// Case 3:
// [3, 3, 5, 0, 1, 2, 2, 2]
// [3, 5, 0, 1, 2, 2, 2, 3]
// [5, 0, 1, 2, 2, 2, 3, 3]
class Solution {
    public int findMin(int[] nums) {
        int left = 0;
        int right = nums.length - 1;
        while (left + 1 < right) {
            while (left + 1 < nums.length && nums[left] == nums[left + 1]) {
                left++;
            }

            while (right - 1 >= 0 && nums[right] == nums[right - 1]) {
                right--;
            }

            int mid = left + (right - left) / 2;
            if (nums[left] < nums[mid] && nums[mid] < nums[right]) {
                right = mid;
            } else if (nums[mid] > nums[right]) {
                left = mid;
            } else {
                right = mid;
            }
        }

        return Math.min(nums[left], nums[right]);
    }
}