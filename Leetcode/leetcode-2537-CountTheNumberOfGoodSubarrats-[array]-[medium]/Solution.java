class Solution {
    public long countGood(int[] nums, int k) {
        HashMap<Integer, Integer> counts = new HashMap<>();

        long goodSubarrays = 0;
        long pairs = 0;
        int i = 0, j = 0;
        while (j < nums.length) {
            counts.put(nums[j], counts.getOrDefault(nums[j], 0) + 1);
            pairs = counts.get(nums[j]) - 1 + pairs;

            while (pairs >= k) { // Decrease the subarray by advancing the left pointer
                goodSubarrays = (nums.length - j) + goodSubarrays;
                pairs = pairs - (counts.get(nums[i]) - 1);
                counts.put(nums[i], counts.get(nums[i]) - 1);
                i++;
            }
            
            j++;
        }

        return goodSubarrays;
    }
}