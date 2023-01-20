class Solution {
    public int sumOfUnique(int[] nums) {
        int sum = 0;
        HashMap<Integer, Integer> visited = new HashMap<>();
        for (int num : nums) {
            visited.put(num, visited.getOrDefault(num, 0) + 1);
        }

        for (Map.Entry<Integer, Integer> entry : visited.entrySet()) {
            if (entry.getValue() == 1) {
                sum += entry.getKey();
            }
        }

        return sum;
    }
}