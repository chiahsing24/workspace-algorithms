class Solution {
    public int findDuplicate(int[] nums) {
    
        // nums = [1, 2, 3, 4, 5, 3]
        // So, one of the number inside [1, 2, 3, 4, 5] is the duplicate number [1, n]
        // mid is at index = 2, nums[mid] = 3
        // Start counting total number of numbers that are smaller than mid is greater than mid, it means possible number is on the left side
        // Vice versa, for the right side
        int left = 1, right = nums.length - 1;
        while (left + 1 < right) {
            int mid = left + (right - left) / 2;
            if (counts(nums, mid) > mid) {
                right = mid;
            } else {
                left = mid;
            }
        }

        if (counts(nums, left) > left) {
            return left;
        }

        return right;
    }

    public int counts(int[] nums, int mid) {
        int cnt = 0;
        for (int num : nums) {
            if (num <= (mid)) {
                cnt++;
            }
        }

        return cnt;
    }
}