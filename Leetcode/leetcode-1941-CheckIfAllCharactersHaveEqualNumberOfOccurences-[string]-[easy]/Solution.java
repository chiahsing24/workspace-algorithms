class Solution {
    public boolean areOccurrencesEqual(String s) {
        HashMap<Character, Integer> counts = new HashMap<>();
        for (char ch : s.toCharArray()) {
            counts.put(ch, counts.getOrDefault(ch, 0) + 1);
        }

        int cnt = -1;
        for (Map.Entry<Character, Integer> entry : counts.entrySet()) {
            if (cnt == -1) {
                cnt = entry.getValue();
            }

            if (entry.getValue() != cnt) {
                return false;
            }
        }

        return true;
    }
}