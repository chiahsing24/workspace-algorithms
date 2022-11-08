class Solution {
    public boolean containsDuplicate(int[] nums) {
        Map<Integer, Integer> lookup = new HashMap<>();
        
        for (int num : nums) {
            if (lookup.containsKey(num)) {
                lookup.put(num, lookup.get(num) + 1);
            } else {
                lookup.put(num, 1);
            }
        }
        
        boolean allContainDuplicate = false;
        for (int num : nums) {
            if (lookup.get(num) >= 2) {
                allContainDuplicate = true;
            }
        }
        
        return allContainDuplicate;
    }
}