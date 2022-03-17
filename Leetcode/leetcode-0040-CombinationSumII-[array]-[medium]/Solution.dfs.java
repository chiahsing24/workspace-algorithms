class Solution {
    public List<List<Integer>> combinationSum2(int[] candidates, int target) {
        List<List<Integer>> result = new ArrayList<>();
        if (candidates == null || candidates.length == 0) {
            return result;
        }
        
        Arrays.sort(candidates);
        List<Integer> combination = new ArrayList<>();
        find(candidates, 0, target, combination, result, 0);
        
        return result;
    }
    
    public void find(int[] candidates, int startIndex, int target, List<Integer> combination, List<List<Integer>> result, int curSum) {
        if (curSum > target) {
            return;
        }
        
        if (curSum == target) {
            result.add(new ArrayList<Integer>(combination));
            return;
        }
        
        for (int i = startIndex; i < candidates.length; i++) {
            if (curSum + candidates[i] > target) {
                break;
            }
            
            if (i != startIndex && candidates[i] == candidates[i - 1]) {
                continue;
            }
            combination.add(candidates[i]);
            find(candidates, i + 1, target, combination, result, curSum + candidates[i]);
            combination.remove(combination.size() - 1);
        }
    }
}