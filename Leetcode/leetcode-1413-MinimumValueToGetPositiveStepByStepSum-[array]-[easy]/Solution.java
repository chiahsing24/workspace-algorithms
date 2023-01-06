class Solution {
    public int minStartValue(int[] nums) {
        int startValue = 1;
        int curSum = 0;
        int i = 0;
        while (startValue < 10001 && i < nums.length) {
            if (curSum == 0 && i == 0) {
                curSum = startValue;
            }

            if (curSum + nums[i] >= 1) {
                curSum += nums[i];
                i++;
            } else {
                startValue++;
                curSum = 0;
                i = 0;
            }
        }

        return startValue;
    }
}