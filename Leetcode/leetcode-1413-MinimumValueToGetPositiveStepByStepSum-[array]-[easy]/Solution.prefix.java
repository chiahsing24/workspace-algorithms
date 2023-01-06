class Solution {
    public int minStartValue(int[] nums) {
        int[] prefixSum = new int[nums.length];
        int sum = 0;
        for (int i = 0; i < nums.length; i++) {
            sum = sum + nums[i];
            prefixSum[i] = sum;
        }
        
        int minPrefixSum = Integer.MAX_VALUE;
        for (int num : prefixSum) {
            minPrefixSum = Math.min(num, minPrefixSum);
        }
            
        return Math.max(1, 1 - minPrefixSum);
    }
}