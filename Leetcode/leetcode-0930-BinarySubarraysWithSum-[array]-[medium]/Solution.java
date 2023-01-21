class Solution {
    public int numSubarraysWithSum(int[] nums, int goal) {
        int[] prefix = new int[nums.length];
        prefix[0] = nums[0];
        for (int i = 1; i < nums.length; i++) {
            prefix[i] = prefix[i - 1] + nums[i];
        }

        HashMap<Integer, Integer> prefixHistory = new HashMap<>();
        prefixHistory.put(0, 1);
        int cnt = 0;
        for (int i = 0; i < nums.length; i++) {
            if (prefixHistory.get(prefix[i] - goal) != null) {
                cnt += prefixHistory.getOrDefault(prefix[i] - goal, 0);
            }

            prefixHistory.put(prefix[i], prefixHistory.getOrDefault(prefix[i], 0) + 1);
        }
        

        return cnt;
    }
}