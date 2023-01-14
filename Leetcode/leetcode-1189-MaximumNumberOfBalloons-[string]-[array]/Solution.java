class Solution {
    public int maxNumberOfBalloons(String text) {
        HashMap<Character, Integer> counts = new HashMap<>();
        for (char c : text.toCharArray()) {
            if (c == 'b' || c == 'a' || c == 'l' || c == 'o' || c == 'n') {
                counts.put(c, counts.getOrDefault(c, 0) + 1);
            }
        }

        int cnt = 0;
        while (counts.getOrDefault('l', 0) >= 2 && counts.getOrDefault('o', 0) >= 2 && counts.getOrDefault('b', 0) >= 1 && counts.getOrDefault('a', 0) >= 1 && counts.getOrDefault('n', 0) >= 1) {
            cnt++;
            counts.put('l', counts.get('l') - 2);
            counts.put('o', counts.get('o') - 2);
            counts.put('b', counts.get('b') - 1);
            counts.put('a', counts.get('a') - 1);
            counts.put('n', counts.get('n') - 1);
        }

        return cnt;
    }
}