class Solution {
    public int[] productExceptSelf(int[] nums) {
        int[] productLeft = new int[nums.length];
        int[] productRight = new int[nums.length];
        int[] result = new int[nums.length];
        
        Arrays.fill(productLeft, 1);
        for (int i = 1; i < nums.length; i++) {
            productLeft[i] = nums[i - 1] * productLeft[i - 1];
        }
        
        Arrays.fill(productRight, 1);
        for (int i = nums.length - 2; i >= 0; i--) {
            productRight[i] = nums[i + 1] * productRight[i + 1];
        }
        
        for (int i = 0; i < nums.length; i++) {
            result[i] = productLeft[i] * productRight[i];
        }
        
        return result;
    }
}