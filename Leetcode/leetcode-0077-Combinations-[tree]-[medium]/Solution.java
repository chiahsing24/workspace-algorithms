class Solution {
    public List<List<Integer>> combine(int n, int k) {
        List<List<Integer>> result = new ArrayList<>();
        if (n == 0 || k > n) return result;
        getCombinations(n, k, 1, result, new ArrayList<Integer>());
        return result;
    }
    
    public void getCombinations(int n, int k, int start, List<List<Integer>> result, List<Integer> combination) {
        if (combination.size() == k) {
            result.add(new ArrayList<Integer>(combination));
        }

        for (int i = start; i <= n; i++) {
            combination.add(i);
            getCombinations(n, k, i + 1, result, combination);
            combination.remove(combination.size() - 1);
        }
    }
}