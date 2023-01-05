class Solution {
    public double findMaxAverage(int[] nums, int k) {
        int curSum = 0, maxSum = 0;
        for (int i = 0; i < k; i++) {
            curSum += nums[i];
        }

        maxSum = curSum;
        int left = 0, right = k - 1;
        while (right + 1 < nums.length) {
            curSum += nums[++right];
            curSum -= nums[left++];
            maxSum = Math.max(maxSum, curSum);
        }

        double res = (double) maxSum / k;
        return res;
    }
}