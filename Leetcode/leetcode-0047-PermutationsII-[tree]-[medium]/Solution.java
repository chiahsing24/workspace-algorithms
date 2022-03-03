class Solution {
    public List<List<Integer>> permuteUnique(int[] nums) {
        List<List<Integer>> result = new ArrayList<>();
        if (nums == null || nums.length == 0) return result;
        Arrays.sort(nums);
        findPermutations(nums, result, new ArrayList<Integer>(), new HashSet<Integer>());
        return result;
    }
    
    public void findPermutations(int[] nums, List<List<Integer>> result, List<Integer> permutation, HashSet<Integer> visited) {
        if (permutation.size() == nums.length) {
            result.add(new ArrayList<Integer>(permutation));
            return;
        }
        
        for (int i = 0; i < nums.length; i++) {
            if (visited.contains(i)) {
                continue;
            }
            
            if (i != 0 && nums[i] == nums[i - 1] && !visited.contains(i - 1)) {
                continue;
            }
            
            permutation.add(nums[i]);
            visited.add(i);
            findPermutations(nums, result, permutation, visited);
            visited.remove(i);
            permutation.remove(permutation.size() - 1);
        }
    }
}