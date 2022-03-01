class Solution {
    public List<List<Integer>> subsets(int[] nums) {
        List<List<Integer>> result = new ArrayList<>();
        if (nums == null || nums.length == 0) return result;
        Arrays.sort(nums);
        getSubsets(nums, 0, new ArrayList<Integer>(), result);
        return result;
    }
    
    public void getSubsets(int[] nums, int start, List<Integer> subset, List<List<Integer>> result) {
        result.add(new ArrayList<Integer>(subset));         
        for (int i = start; i < nums.length; i++) {
            subset.add(nums[i]);
            getSubsets(nums, i + 1, subset, result);
            subset.remove(subset.size() - 1);
        }
    }
}