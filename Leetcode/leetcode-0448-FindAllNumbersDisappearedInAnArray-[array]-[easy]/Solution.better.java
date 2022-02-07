class Solution {
    public List<Integer> findDisappearedNumbers(int[] nums) {
        List<Integer> result = new ArrayList<>();
        for (int i = 0; i < nums.length; i++) {
            int curVal = Math.abs(nums[i]);
            nums[curVal - 1] = nums[curVal - 1] > 0 ? -nums[curVal - 1]: nums[curVal - 1];
        }
        
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] > 0) {
                result.add(i + 1);
            }
        }
        
        return result;
    }
}