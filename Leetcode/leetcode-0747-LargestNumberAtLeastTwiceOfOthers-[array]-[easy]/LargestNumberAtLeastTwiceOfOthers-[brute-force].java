class Solution {
    public int dominantIndex(int[] nums) {
        if (nums.length == 1) {
            return 0;
        } else if (nums.length > 1) {
            int largest = nums[0];
            int largestIdx = 0;
            for (int i = 1; i < nums.length; i++) {
                if (nums[i] >= largest) {
                    largest = nums[i];
                    largestIdx = i;
                }
            }

            int cnt = 0;
            for (int i = 0; i < nums.length; i++) {
                if (nums[i] == largest) {
                    cnt++;
                } else if (nums[i] * 2 <= largest) {
                    cnt++;
                }
            }
            
            if (cnt == nums.length) {
                return largestIdx;
            }
            return - 1;
        } else {
            return -1;
        }
    }
}

