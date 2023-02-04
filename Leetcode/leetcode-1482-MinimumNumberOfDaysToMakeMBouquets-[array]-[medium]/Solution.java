class Solution {
    public int minDays(int[] bloomDay, int m, int k) {
        int left = Integer.MAX_VALUE;
        int right = Integer.MIN_VALUE;
        for (int day : bloomDay) {
            left = Math.min(left, day);
            right = Math.max(right, day);
        }

        while (left + 1 < right) {
            int mid = left + (right - left) / 2;
            if (canMakeMBouquets(bloomDay, mid, m, k)) {
                right = mid;
            } else {
                left = mid;
            }
        }

        if (canMakeMBouquets(bloomDay, left, m, k)) {
            return left;
        }

        if (canMakeMBouquets(bloomDay, right, m, k)) {
            return right;
        }

        return -1;
    }

    public boolean canMakeMBouquets(int[] bloomday, int expectedWaitDays, int m, int k) {
        int bouquetCnt = 0;
        int adjacentFlowerCnt = 0;
        for (int i = 0; i < bloomday.length; i++) {
            if (bloomday[i] <= expectedWaitDays) {
                adjacentFlowerCnt++;
            } else {
                adjacentFlowerCnt = 0;
            }

            if (adjacentFlowerCnt == k) {
                bouquetCnt++;
                adjacentFlowerCnt = 0;
            }
        }

        return bouquetCnt >= m;
    }
}