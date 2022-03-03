class Solution {
    public int cnt;
    
    public int findTargetSumWays(int[] nums, int target) {
        if (nums == null || nums.length == 0) return 0;
        find(nums, target, 0, 0);
        return cnt;
    }
    
    public void find(int[] nums, int target, int index, int curSum) {
        if (index == nums.length) {
            if (target == curSum) {
                cnt++;
            }
            return;
        }
        find(nums, target, index + 1, curSum + nums[index]);
        find(nums, target, index + 1, curSum - nums[index]);
    }
}