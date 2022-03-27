class Solution {
    public int threeSumClosest(int[] nums, int target) {
        Arrays.sort(nums);
        
        int smallestDiff = Integer.MAX_VALUE;
        int bestSum = nums[0] + nums[1] + nums[2];
        for (int i = 0; i < nums.length; i++) {
            int left = i + 1;
            int right = nums.length - 1;
            while (left < right) {
                int sum = nums[i] + nums[left] + nums[right];
                if (Math.abs(sum - target) < smallestDiff) {
                    smallestDiff = Math.abs(sum - target);
                    bestSum = sum;
                } 
                
                if (sum > target) {
                    right--;
                } else {
                    left++;
                }
            }
        }
        
        
        return bestSum;
    }
}