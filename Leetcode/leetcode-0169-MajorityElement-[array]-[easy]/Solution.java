class Solution {
    public int majorityElement(int[] nums) {
        HashMap<Integer, Integer> counts = new HashMap<>();
        for (int num : nums) {
            if (!counts.containsKey(num)) {
                counts.put(num, 1);
            } else {
                counts.put(num, counts.getOrDefault(num, 0) + 1);
            }
        }

        int ans = -1;
        int count = 0;
        for (Map.Entry<Integer, Integer> entry : counts.entrySet()) {
            int curValue = entry.getKey();
            int curCount = entry.getValue();
            if (count == 0 || curCount > count) {
                ans = curValue;
                count = curCount;
            }
        }

        return ans;
    }
}