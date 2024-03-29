// Case 1:
// [0, 1, 2, 4, 5, 6, 7]
// [1, 2, 4, 5, 6, 7, 0]
// [2, 4, 5, 6, 7, 0, 1]
// [4, 5, 6, 7, 0, 1, 2]
// -----------------------
// Case 2:
// [5, 6, 7, 0, 1, 2, 4]
// [6, 7, 0, 1, 2, 4, 5]
// [7, 0, 1, 2, 4, 5, 6]
class Solution {
    public int search(int[] nums, int target) {
        int left = 0, right = nums.length - 1;
        while (left + 1 < right) {
            int mid = left + (right - left) / 2;
            if (nums[mid] > nums[left]) {
                if (nums[left] <= target && target <= nums[mid]) {
                    right = mid;
                } else {
                    left = mid;
                }
            } else {
                if (nums[mid] <= target && target <= nums[right]) {
                    left = mid;
                } else {
                    right = mid;
                }
            }
        }

        if (nums[left] == target) {
            return left;
        }

        if (nums[right] == target) {
            return right;
        }

        return -1;
    }
}

