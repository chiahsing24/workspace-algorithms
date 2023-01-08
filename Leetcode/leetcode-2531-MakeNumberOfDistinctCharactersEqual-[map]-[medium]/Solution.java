class Solution {
    public boolean isItPossible(String word1, String word2) {
        HashMap<Character, Integer> original1 = new HashMap<>();
        HashMap<Character, Integer> original2 = new HashMap<>();

        char[] chars1 = word1.toCharArray();
        char[] chars2 = word2.toCharArray();
        ArrayList<Character> uniqueChars1 = new ArrayList<>();
        ArrayList<Character> uniqueChars2 = new ArrayList<>(); 

        for (char ch : chars1) {
            if (!original1.containsKey(ch)) {
                uniqueChars1.add(ch);
            }
            original1.put(ch, original1.getOrDefault(ch, 0) + 1);

        }

        for (char ch : chars2) {
            if (!original2.containsKey(ch)) {
                uniqueChars2.add(ch);
            }
            original2.put(ch, original2.getOrDefault(ch, 0) + 1);
        }

		// Reduce the search range by only traversing through the nested loop with unique characters in word1 and word2
        for (int i = 0; i < uniqueChars1.size(); i++) {
            for (int j = 0; j < uniqueChars2.size(); j++) {
                char ch1 = uniqueChars1.get(i);
                char ch2 = uniqueChars2.get(j);

                original1.put(ch1, original1.getOrDefault(ch1, 0) - 1);
                original1.put(ch2, original1.getOrDefault(ch2, 0) + 1);

                original2.put(ch2, original2.getOrDefault(ch2, 0) - 1);
                original2.put(ch1, original2.getOrDefault(ch1, 0) + 1);

                if (original1.getOrDefault(ch1, 0) == 0) {
                    original1.remove(ch1);
                }

                if (original2.getOrDefault(ch2, 0) == 0) {
                    original2.remove(ch2);
                }

                if (original1.size() == original2.size()) {
                    return true;
                }

                original1.put(ch2, original1.getOrDefault(ch2, 0) - 1);
                original1.put(ch1, original1.getOrDefault(ch1, 0) + 1);

                original2.put(ch1, original2.getOrDefault(ch1, 0) - 1);
                original2.put(ch2, original2.getOrDefault(ch2, 0) + 1);

                if (original1.getOrDefault(ch2, 0) == 0) {
                    original1.remove(ch2);
                }

                if (original2.getOrDefault(ch1, 0) == 0) {
                    original2.remove(ch1);
                }
            }
        }

        return false;
    }
}