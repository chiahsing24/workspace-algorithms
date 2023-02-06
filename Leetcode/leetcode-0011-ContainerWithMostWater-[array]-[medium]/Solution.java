class Solution {
    public int maxArea(int[] height) {
        int water = 0;
        int left = 0, right = height.length - 1;
        while (left < right) {
            int amount = (right - left) * Math.min(height[right], height[left]);
            water = Math.max(water, amount);
            if (height[left] < height[right]) { // 假設round 1: 左邊height為1, 右邊假設往左移可以變更高也沒用, 因為被左邊height限制住, 面積只會變小
                left++;
            } else {
                right--;
            }
        }

        return water;
    }
}