public class Solution {
    /**
     * @param nums: the list of numbers
     * @return: return the maximum number.
     */
    public int maxNum(List<Integer> nums) {
        // write your code here
        return maxNum(nums, 0, nums.size() - 1, Integer.MIN_VALUE);
    }

    public int maxNum(List<Integer> nums, int start, int end, int result) {
        while (true) {
            if (start > end) {
                return result;
            }

            List<Integer> nextNums = nums;
            int nextStart = start + 1, nextEnd = end;
            int nextResult = Math.max(result, nums.get(start));

            nums = nextNums;
            start = nextStart;
            end = nextEnd;
            result = nextResult;
        }
    }
}