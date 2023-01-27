class Solution {
    public int[] searchRange(int[] nums, int target) {
        int firstPos = -1;
        int lastPos = -1;
        
        int[] result = new int[2];
        result[0] = firstPos;
        result[1] = lastPos;
        if (nums.length == 0) {
            return result;
        }

        int left = 0;
        int right = nums.length - 1;
        while (left + 1 < right) {
            int mid = left + (right - left) / 2;
            if (nums[mid] < target) {
                left = mid;
            } else {
                right = mid;
            }
        }

        if (nums[left] == target) {
            firstPos = left;
        } else if (nums[right] == target) {
            firstPos = right;
        }

        left = 0;
        right = nums.length - 1;
        while (left + 1 < right) {
            int mid = left + (right - left) / 2;
            if (nums[mid] <= target) {
                left = mid;
            } else {
                right = mid;
            }
        }

        if (nums[right] == target) {
            lastPos = right;
        } else if (nums[left] == target) {
            lastPos = left;
        }
        
        result[0] = firstPos;
        result[1] = lastPos;

        return result;
    } 
}