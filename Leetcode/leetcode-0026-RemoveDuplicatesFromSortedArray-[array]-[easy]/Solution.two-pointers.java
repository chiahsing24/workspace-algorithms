class Solution {
    public int removeDuplicates(int[] nums) {
        int i = 0, j = 0;
        int curNum = Integer.MIN_VALUE;
        while (i < nums.length) {
            if (nums[i] != curNum) {
                curNum = nums[i];
                nums[j] = curNum;
                j++;
            }

            i++;
        }

        return j;
    }
}