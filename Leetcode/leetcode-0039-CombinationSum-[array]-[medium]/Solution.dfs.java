class Solution {
    public List<List<Integer>> combinationSum(int[] candidates, int target) {
        List<List<Integer>> result = new ArrayList<>();
        if (candidates == null || candidates.length == 0) {
            return result;
        }
        
        Arrays.sort(candidates);
        
        List<Integer> temp = new ArrayList<>();
        int curSum = 0;
        
        find(result, temp, candidates, 0, curSum, target);
        
        return result;
    }
    
    public void find(List<List<Integer>> result, List<Integer> temp, int[] candidates, int startIndex, int curSum, int target) {
        if (curSum > target) {
            return;
        }
        
        if (curSum == target) {
            result.add(new ArrayList<Integer>(temp));
            return;
        }
        
        for (int i = startIndex; i < candidates.length; i++) {
            if (curSum + candidates[i] > target) {
                break;
            }
            temp.add(candidates[i]);
            find(result, temp, candidates, i, curSum + candidates[i], target);
            temp.remove(temp.size() - 1);
        }
    }
}