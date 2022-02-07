class Solution {
    public List<Integer> findDisappearedNumbers(int[] nums) {
        List<Integer> result = new ArrayList<>();
        HashMap<Integer, Integer> hmap = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            if (!hmap.containsKey(nums[i])) {
                hmap.put(nums[i], 1);
            }
        }
        
        for (int i = 1; i <= nums.length; i++) {
            if (!hmap.containsKey(i)) {
                result.add(i);
            }
        }
        
        return result;
    }
}