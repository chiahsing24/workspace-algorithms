class Solution {
    public List<Integer> intersection(int[][] nums) {
        ArrayList<Integer> result = new ArrayList<>();
        HashMap<Integer, Integer> frequency = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            for (int j = 0; j < nums[i].length; j++) {
                frequency.put(nums[i][j], frequency.getOrDefault(nums[i][j], 0) + 1);
            }
        }

        for (Map.Entry<Integer, Integer> entry : frequency.entrySet()) {
            if (entry.getValue() == nums.length) {
                result.add(entry.getKey());
            }
        }

        Collections.sort(result);

        return result;
    }
}