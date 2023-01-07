class Solution {
    public int minSubArrayLen(int target, int[] nums) {
        int[] prefixSum = new int[nums.length];
        prefixSum[0] = nums[0];
        for (int i = 1; i < nums.length; i++) {
            prefixSum[i] = prefixSum[i - 1] + nums[i];
        }

        int min = Integer.MAX_VALUE;
        int left = 0, right = 0;
        while (right < nums.length) {
            while (left < nums.length && right < nums.length && prefixSum[right] - prefixSum[left] + nums[left] < target) {
                right++;
            }

            if (left < nums.length && right < nums.length) {
                min = Math.min(min, right - left + 1);
                if (left == right) {
                    left++;
                    right++;
                } else {
                    left++;
                }
            }
        }
        
        return min == Integer.MAX_VALUE ? 0 : min;
    }
}