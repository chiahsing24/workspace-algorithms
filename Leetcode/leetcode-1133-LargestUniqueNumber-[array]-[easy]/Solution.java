class Solution {
    public int largestUniqueNumber(int[] nums) {
        HashMap<Integer, Integer> count = new HashMap<>();
        for (int num : nums) {
            count.put(num, count.getOrDefault(num, 0) + 1);
        }
        
        List<Integer> res = new ArrayList<>();
        for (Map.Entry<Integer, Integer> entry : count.entrySet()) {
            if (entry.getValue() == 1) {
                res.add(entry.getKey());
            }
        }
        
        if (res.size() > 0) {
            Collections.sort(res, Collections.reverseOrder());
            return res.get(0);
        } else {
            return -1;
        }        
    }
}