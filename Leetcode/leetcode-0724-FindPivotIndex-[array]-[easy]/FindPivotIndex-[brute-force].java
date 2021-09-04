class Solution {
    public int pivotIndex(int[] nums) {
        int leftSum;
        int rightSum;
        for (int i = 0; i < nums.length; i++) {
            leftSum = 0;
            rightSum = 0;
            
            if (i == 0) {
                leftSum = 0;
            } else {
                for (int lPtr = 0; lPtr < i; lPtr++) {
                    leftSum += nums[lPtr];      
                }
            }
            
            
            if (i == nums.length - 1) {
                rightSum = 0;
            } else {
                for (int rPtr = nums.length - 1; rPtr > i; rPtr--) {
                    rightSum += nums[rPtr];
                }
            }
            
            if (leftSum == rightSum) {
                return i;
            }
        }
        return -1;
    }
}