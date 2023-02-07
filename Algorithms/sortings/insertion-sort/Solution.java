/**
 *  從數組中第2位數字開始, 每次從第i個逐個與前面已排好序的數組比較, 找到該插入的位置, 進行調換
 */
public class Solution {
    public int[] sortArray(int[] nums) {
        for (int i = 1; i < nums.length; i++) {
            int temp = nums[i];
            int j = i;
            while (j > 0 && nums[j - 1] > temp) {
                nums[j] = nums[j - 1];
                j--;
            }

            nums[j] = temp;
        }

        return nums;
    }
}

