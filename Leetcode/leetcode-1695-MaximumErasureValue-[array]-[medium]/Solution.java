class Solution {
    public int maximumUniqueSubarray(int[] nums) {
        HashSet<Integer> visited = new HashSet<>();

        int[] prefix = new int[nums.length];
        prefix[0] = nums[0];
        for (int i = 1; i < nums.length; i++) {
            prefix[i] = prefix[i - 1] + nums[i];
        }

        int sum = 0;
        int i = 0, j = 0;
        while (j < nums.length) {
            while (i < nums.length && j < nums.length && !visited.contains(nums[j])) {
                sum = Math.max(sum, prefix[j] - prefix[i] + nums[i]);
                visited.add(nums[j]);
                j++;
            }

            while (i < nums.length && j < nums.length && visited.contains(nums[j])) {
                visited.remove(nums[i]);
                i++;
            }
        }

        return sum;
    }
}