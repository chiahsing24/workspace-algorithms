class Solution {
    public int findMaxConsecutiveOnes(int[] nums) {
        int max = 0;
        int consecutive = 0;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == 1) {
                consecutive++;
                max = Math.max(max, consecutive);
            } else {
                consecutive = 0;
            }
        }
        return max;
    }
}