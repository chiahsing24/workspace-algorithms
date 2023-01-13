/**
 *  Time Complexity: O(n)
 *  Space Complexity: O(n)
 */

 class Solution {
    public int subarraySum(int[] nums, int k) {
        int[] prefix = new int[nums.length];
        prefix[0] = nums[0];

        for (int i = 1; i < nums.length; i++) {
            prefix[i] = prefix[i - 1] + nums[i];
        }

        HashMap<Integer, Integer> history = new HashMap<>();
        // Initialize for the empty subarray, [] has the sum of zero.
        history.put(0, 1); 

        int cnt = 0;
        for (int i = 0; i < prefix.length; i++) {
            int target = prefix[i] - k;
            if (history.containsKey(target)) {
                cnt += history.getOrDefault(target, 0);
            }

            // Why we need to update the visited prefix sum?
            // (ex) k = 1, input = [1, -1, 1, 1], prefixSum = [1, 0, 1, 0]
            // 當我們到index = 2時, 這時prefixSum[2] = 1, 由於prefixSum = 0有兩次visited, 
            // 代表已index = 2結束的subarray, 有兩個subarray滿足條件, 分別為[1], [1, -1, 1]
            history.put(prefix[i], history.getOrDefault(prefix[i], 0) + 1);
        }

        return cnt;
    }
}