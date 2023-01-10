class NumArray {
    private int[] input;
    private int[] prefix;

    public NumArray(int[] nums) {
        int[] original = new int[nums.length];
        int[] prefixSum = new int[nums.length];

        original[0] = nums[0];
        prefixSum[0] = nums[0];
        for (int i = 1; i < nums.length; i++) {
            original[i] = nums[i];
            prefixSum[i] = prefixSum[i - 1] + nums[i];
        }

        prefix = prefixSum;
        input = original;
    }
    
    public int sumRange(int left, int right) {
        return prefix[right] - prefix[left] + input[left];
    }
}

/**
 * Your NumArray object will be instantiated and called as such:
 * NumArray obj = new NumArray(nums);
 * int param_1 = obj.sumRange(left,right);
 */