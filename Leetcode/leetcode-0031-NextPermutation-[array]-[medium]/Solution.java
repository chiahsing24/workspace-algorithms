class Solution {
    public int[] nextPermutation(int[] nums) {
        int index = -1;
        for (int i = nums.length - 2; i >= 0; i--) {
            if (nums[i] < nums[i + 1]) {
                index = i;
                break;
            }
        }
        
        if (index == -1) {
            reverse(nums, 0, nums.length - 1);
            return nums;
        }
        
        int nextBiggerIndex = index + 1;
        for (int i = nums.length - 1; i > index; i--) {
            if (nums[i] > nums[index]) {
                nextBiggerIndex = i;
                break;
            }
        }
        
        int temp = nums[index];
        nums[index] = nums[nextBiggerIndex];
        nums[nextBiggerIndex] = temp;
        
        reverse(nums, index + 1, nums.length - 1);
        return nums;
    }
    
    public void reverse(int[] nums, int start, int end) {
        int left = start, right = end;
        while (left < right) {
            int temp = nums[left];
            nums[left] = nums[right];
            nums[right] = temp;
            left++;
            right--;
        }
    }
}