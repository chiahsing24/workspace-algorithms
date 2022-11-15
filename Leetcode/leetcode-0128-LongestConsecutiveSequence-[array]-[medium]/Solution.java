class Solution {
    public int longestConsecutive(int[] nums) {
        if (nums.length == 0 || nums.length == 1) {
            return nums.length;
        }
        
        Arrays.sort(nums);
        
        int longest = 1;
        int i = 1;
        int tempLongest = 1;
        while (i < nums.length) {    
            if (nums[i] == nums[i - 1] + 1) {
                tempLongest++;
            } else if (nums[i] - nums[i - 1] >= 2) {
                tempLongest = 1;     
            }
            
            longest = Math.max(longest, tempLongest);
            i++;
        }
        
        return longest;
    }
}