class Solution {
    public int[] sortedSquares(int[] nums) {
        int[] result = new int[nums.length];
        
        int i = nums.length - 1;
        int start = 0, end = nums.length - 1;
        while (start <= end && i >= 0) {
            int leftVal = nums[start] * nums[start];
            int rightVal = nums[end] * nums[end];
            if (leftVal > rightVal) {
                result[i] = leftVal;
                start++;
            } else {
                result[i] = rightVal;
                end--;
            }
            
            i--;
        }
        
        return result;
    }
}