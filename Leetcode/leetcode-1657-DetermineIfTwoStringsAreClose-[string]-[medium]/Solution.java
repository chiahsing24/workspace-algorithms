class Solution {
    public boolean closeStrings(String word1, String word2) {
        int[] charOccurence1 = new int[26];
        int[] charOccurence2 = new int[26];

        Set<Character> distinctChars1 = new HashSet<>();
        Set<Character> distinctChars2 = new HashSet<>();
        for (char ch : word1.toCharArray()) {
            charOccurence1[ch - 'a']++;
            distinctChars1.add(ch);
        }

        for (char ch : word2.toCharArray()) {
            charOccurence2[ch - 'a']++;
            distinctChars2.add(ch);
        }

        Arrays.sort(charOccurence1);
        Arrays.sort(charOccurence2);

        return distinctChars1.equals(distinctChars2) && Arrays.equals(charOccurence1, charOccurence2);
    }
}