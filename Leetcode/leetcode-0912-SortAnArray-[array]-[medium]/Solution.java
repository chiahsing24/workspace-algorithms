class Solution {
    public int[] sortArray(int[] nums) {
        int left = 0;
        int right = nums.length - 1;
        quicksort(nums, left, right);
        return nums;
    }

    public void quicksort(int[] nums, int left, int right) {
        if (left >= right) {
            return;
        }
        int initialLeft = left;
        int initialRight = right;
        int pivotIndex = right;
        int pivot = nums[pivotIndex];
        while (left < right) {
            while (nums[left] <= pivot && left < right) {
                left++;
            }

            while (nums[right] >= pivot && left < right) {
                right--;
            }

            swap(nums, left, right);
        }

        swap(nums, left, pivotIndex);
        quicksort(nums, initialLeft, left - 1);
        quicksort(nums, left + 1, initialRight);
    }

    public void swap(int[] nums, int index1, int index2) {
        int temp = nums[index1];
        nums[index1] = nums[index2];
        nums[index2] = temp;
    }
}