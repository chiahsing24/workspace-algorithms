class Solution {
    public int findLucky(int[] arr) {
        int largest = -1;
        HashMap<Integer, Integer> freq = new HashMap<>();
        for (int num : arr) {
            freq.put(num, freq.getOrDefault(num, 0) + 1);
        }

        for (Map.Entry<Integer, Integer> entry : freq.entrySet()) {
            if (entry.getKey() == entry.getValue()) {
                largest = Math.max(largest, entry.getKey());
            }
        }

        return largest;
    }
}