class Solution {
    public List<List<Integer>> permute(int[] nums) {
        List<List<Integer>> result = new ArrayList<>();
        if (nums == null || nums.length == 0) return result;
        findPermutations(nums, result, new ArrayList<Integer>(), new HashSet<Integer>());
        return result;
    }
    
    public void findPermutations(int[] nums, List<List<Integer>> result, List<Integer> permutation, HashSet<Integer> visited) {
        if (nums.length == permutation.size()) {
            result.add(new ArrayList<Integer>(permutation));
            return;
        }
        
        for (int i = 0; i < nums.length; i++) {
            if (!visited.contains(i)) {
                visited.add(i);
                permutation.add(nums[i]);
                findPermutations(nums, result, permutation, visited);
                permutation.remove(permutation.size() - 1);
                visited.remove(i);
            } 
        }
    }
}