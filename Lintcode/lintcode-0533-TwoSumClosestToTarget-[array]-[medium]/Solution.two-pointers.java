public class Solution {
    /**
     * @param nums: an integer array
     * @param target: An integer
     * @return: the difference between the sum and the target
     */
    public int twoSumClosest(int[] nums, int target) {
        // write your code here
        Arrays.sort(nums);
        
        int best = Integer.MAX_VALUE;
        int start = 0, end = nums.length - 1;
        while (start < end) {
            int diff = Math.abs((nums[start] + nums[end]) - target);
            best = Math.min(best, diff);
            if (nums[start] + nums[end] > target) {
                end--;
            } else {
                start++;
            }
        }

        return best;
    }
}