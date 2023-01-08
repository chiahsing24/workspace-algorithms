class Solution {
    public int maximumCount(int[] nums) {
        int posCnt = 0;
        int negCnt = 0;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] > 0) {
                posCnt++;
            }
            
            if (nums[i] < 0) {
                negCnt++;
            }
        }
        
        return Math.max(posCnt, negCnt);
    }
}