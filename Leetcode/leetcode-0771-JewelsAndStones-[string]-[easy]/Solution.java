class Solution {
    public int numJewelsInStones(String jewels, String stones) {
        HashSet<Character> isJewel = new HashSet<>();
        for (char jewel : jewels.toCharArray()) {
            isJewel.add(jewel);
        }

        int cnt = 0;
        for (char stone : stones.toCharArray()) {
            if (isJewel.contains(stone)) {
                cnt++;
            }
        }

        return cnt;
    }
}