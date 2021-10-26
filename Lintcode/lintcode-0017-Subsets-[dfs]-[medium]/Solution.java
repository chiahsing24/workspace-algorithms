public class Solution {
    /**
     * @param nums: A set of numbers
     * @return: A list of lists
     */
    public List<List<Integer>> subsets(int[] nums) {
        // write your code here
        List<List<Integer>> result = new ArrayList<>();
        
        if (nums == null) {
            return result;
        }

        if (nums.length == 0) {
            result.add(new ArrayList<>());
            return result;
        }

        Arrays.sort(nums);
        List<Integer> subset = new ArrayList<>();
        helper(result, subset, nums, 0);
        
        return result;
    }

    public void helper(List<List<Integer>> result, List<Integer> subset, int[] nums, int startIndex) {
        result.add(new ArrayList<>(subset));

        for (int i = startIndex; i < nums.length; i++) {
            subset.add(nums[i]);
            helper(result, subset, nums, i + 1);
            subset.remove(subset.size() - 1);
        }
    }
}