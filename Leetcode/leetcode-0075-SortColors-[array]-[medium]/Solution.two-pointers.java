class Solution {
    public void sortColors(int[] nums) {
        if (nums.length == 1) {
            return;
        }
        
        int left = 0, right = nums.length - 1, mid = 0;
        while (mid <= right) {
            if (nums[mid] == 0) {
                swap(nums, mid, left);
                mid++;
                left++;
            } else if (nums[mid] == 2) {
                swap(nums, mid, right);
                right--;
            } else {
                mid++;
            }
        }
    }
    
    public void swap(int[] nums, int i, int j) {
        int temp = nums[i];
        nums[i] = nums[j];
        nums[j] = temp;
    }
}