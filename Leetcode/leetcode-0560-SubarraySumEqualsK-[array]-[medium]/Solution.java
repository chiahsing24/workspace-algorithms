class Solution {
    public int subarraySum(int[] nums, int k) {
        int[] prefix = new int[nums.length];
        prefix[0] = nums[0];

        for (int i = 1; i < nums.length; i++) {
            prefix[i] = prefix[i - 1] + nums[i];
        }

        int cnt = 0;
        for (int i = 0; i < nums.length; i++) {
            int j = i;
            while (j < nums.length) {
                int sum = prefix[j] - prefix[i] + nums[i];
                if (sum == k) {
                    cnt++;
                }
                j++;
            }
        }

        return cnt;
    }
}