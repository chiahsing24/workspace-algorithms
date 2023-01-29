class Solution {
    public boolean search(int[] nums, int target) {
        int left = 0, right = nums.length - 1;
        while (left + 1 < right) {
            while (left + 1 < nums.length && nums[left] == nums[left + 1]) {
                left++;
            }

            while (right - 1 >= 0 && nums[right - 1] == nums[right]) {
                right--;
            }

            int mid = left + (right - left) / 2;
            if (nums[left] <= nums[mid] && nums[mid] <= nums[right]) {
                if (target >= nums[mid]) {
                    left = mid;
                } else {
                    right = mid;
                }
            } else {
                if (nums[left] <= nums[mid] && nums[mid] >= nums[right]) {
                    if (nums[left] <= target && target <= nums[mid]) {
                        right = mid;
                    } else {
                        left = mid;
                    }
                } else {
                    if (target <= nums[right] && target >= nums[mid]) {
                        left = mid;
                    } else {
                        right = mid;
                    }
                }
            }
        }

        if (nums[left] == target || nums[right] == target) {
            return true;
        }

        return false;
    }
}



