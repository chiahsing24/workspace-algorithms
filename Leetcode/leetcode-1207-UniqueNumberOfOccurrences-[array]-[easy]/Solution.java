class Solution {
    public boolean uniqueOccurrences(int[] arr) {
        HashMap<Integer, Integer> freq = new HashMap<>();
        for (int num : arr) {
            freq.put(num, freq.getOrDefault(num, 0) + 1);
        }

        HashSet<Integer> frequencies = new HashSet<>();
        for (Integer frequency : freq.values()) {
            if (frequencies.contains(frequency)) {
                return false;
            } else {
                frequencies.add(frequency);
            }
        }

        return true;
    }
}