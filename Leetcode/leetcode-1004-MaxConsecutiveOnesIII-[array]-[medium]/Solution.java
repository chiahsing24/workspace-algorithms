class Solution {
    public int longestOnes(int[] nums, int k) {
        int max = 0;
        int consecutiveOnes = 0;
        int skip = k;

        int left = 0, right = 0;
        while (right < nums.length) {
            while (right < nums.length) {
                if (nums[right] == 1) {
                    consecutiveOnes++;
                    right++;
                } else {
                    if (skip > 0) {
                        consecutiveOnes++;
                        skip--;
                        right++;
                    } else if (skip == 0) {
                        if (nums[left] == 0) {
                            skip++;
                        }

                        consecutiveOnes--;
                        left++;
                    }
                }

                max = Math.max(max, consecutiveOnes);
            }
        } 

        return max;
    }
}