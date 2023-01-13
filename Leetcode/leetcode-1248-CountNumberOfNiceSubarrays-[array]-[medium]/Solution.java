class Solution {
    public int numberOfSubarrays(int[] nums, int k) {
        int[] prefixOddCounts = new int[nums.length];
        int oddCnt = 0;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] % 2 == 1) {
                oddCnt++;
            }

            prefixOddCounts[i] = oddCnt;
        }

        int ans = 0;
        HashMap<Integer, Integer> history = new HashMap<>();
        history.put(0, 1);
        for (int i = 0; i < prefixOddCounts.length; i++) {
            int target = prefixOddCounts[i] - k;
            if (history.containsKey(target)) {
                ans = ans + history.get(target);
            }

            history.put(prefixOddCounts[i], history.getOrDefault(prefixOddCounts[i], 0) + 1);
        }

        return ans;
    }
}leet