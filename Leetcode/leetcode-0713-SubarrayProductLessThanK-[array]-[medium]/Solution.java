class Solution {
    public int numSubarrayProductLessThanK(int[] nums, int k) {
        int count = 0;
        int left = 0, right = 0;
        int product = 1;

        while (right < nums.length) {
            product = product < 0 ? product * nums[right] * -1 : product * nums[right];
            while (product >= k && left == right && right < nums.length) {
                product = -1;
                right++;
                left++;
            }

            while (product >= k && left < right && right < nums.length) {
                product = product / nums[left];
                left++;
            }

            if (product < k && product >= 0 && right >= left) {
                count = count + (right - left + 1);
                right++;
            }
        }

        return count;
    }
}