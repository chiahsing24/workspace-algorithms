public class Solution {
    /**
     * @param nums: an array of integer
     * @param target: an integer
     * @return: an integer
     */
    public int twoSum5(int[] nums, int target) {
        // write your code here
        Arrays.sort(nums);
        int cnt = 0;
        int start = 0, end = nums.length - 1;
        while (start < end) {
            if (nums[start] + nums[end] > target) {
                end--;
            } else {
                cnt += end - start;
                start++;
            }
        }

        return cnt;
    }
}