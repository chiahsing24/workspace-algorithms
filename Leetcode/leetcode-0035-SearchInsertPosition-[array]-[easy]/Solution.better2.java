class Solution {
    public int searchInsert(int[] nums, int target) {
        if (nums.length == 1) {
            if (target <= nums[0]) {
                return 0;
            } else {
                return 1;
            }
        }

        if (target > nums[nums.length - 1]) {
            return nums.length;
        }

        int left = 0, right = nums.length - 1;
        while (left + 1 < right) {
            int mid = left + (right - left) / 2;
            if (nums[mid] > target) {
                right = mid;
            } else {
                left = mid;
            }
        }

        if (target <= nums[left]) {
            return left;
        } else if (target > nums[right]) {
            return right + 1;
        } else {
            return right;
        }
    }
}