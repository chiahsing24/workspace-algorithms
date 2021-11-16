public class Solution {
    /**
     * @param nums: an array
     * @param k: an integer
     * @return: the maximum average value
     */
    public double findMaxAverage(int[] nums, int k) {
        // Write your code here
        int maxSum = 0;
        int curSum = 0;
        for (int i = 0; i < k; i++) {
            curSum += nums[i];
        }
        maxSum = curSum;

        for (int i = k; i < nums.length; i++) {
            curSum = curSum + nums[i] - nums[i - k];
            if (curSum > maxSum) {
                maxSum = curSum;
            } 
        }

        double maxAve = (double) maxSum / k;
        return maxAve;
    }
}