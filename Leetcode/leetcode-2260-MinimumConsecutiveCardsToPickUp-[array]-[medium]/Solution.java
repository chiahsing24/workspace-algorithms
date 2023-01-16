class Solution {
    public int minimumCardPickup(int[] cards) {
        HashMap<Integer, Integer> counts = new HashMap<>();

        int min = Integer.MAX_VALUE;
        int right = 1;
        int left = 0;
        counts.put(cards[0], 0);
        while (right < cards.length && left < cards.length) {
            if (counts.getOrDefault(cards[right], -1) > -1) {
                min = Math.min(min, right - counts.get(cards[right]) + 1);
                left = counts.get(cards[right]) + 1;
                counts.put(cards[right], right);
            } else {
                counts.put(cards[right], right);
            }
            right++;
        }

        return min == Integer.MAX_VALUE ? -1 : min; 
    }
}