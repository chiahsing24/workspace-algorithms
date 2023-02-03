class Solution {
    public int splitArray(int[] nums, int k) {
        int left = 0;
        int right = 0;
        for (int num : nums) {
            left = Math.max(left, num);
            right += num;
        }

        while (left + 1 < right) {
            int mid = left + (right - left) / 2;
            if (splitArrayIntoPieces(nums, mid) <= k) {
                right = mid;
            } else {
                left = mid;
            }
        }

        // 為什麼是小於等於, 不是等於而已??
        if (splitArrayIntoPieces(nums, left) <= k) {
            return left;
        } else {
             return right;
        }
    }

    public int splitArrayIntoPieces(int[] nums, int maxTargetSum) {
        int sum = 0;
        int pieces = 1;
        for (int num : nums) {
            if (sum + num > maxTargetSum) {
                sum = num;
                pieces++;
            } else {
                sum += num;
            }
        }

        return pieces;
    }
}