class Solution {
    public int minEatingSpeed(int[] piles, int h) {
        int left = 1, right = findMaxPiles(piles);
        System.out.println("right: " + right);
        while (left + 1 < right) {
            int mid = left + (right - left) / 2;
            if (canFinishWithSpeed(piles, mid, h)) {
                right = mid;
            } else {
                left = mid;
            }
        }

        if (canFinishWithSpeed(piles, left, h)) {
            return left;
        } 

        return right;
    }

    public int findMaxPiles(int[] piles) {
        int max = Integer.MIN_VALUE;
        for (int num : piles) {
            max = Math.max(max, num);
        }

        return max;
    }

    public boolean canFinishWithSpeed(int[] piles, int speed, int h) {
        int hours = 0;
        for (int bananas : piles) {
            hours += Math.ceil((double) bananas / speed);
        }

        return hours <= h;
    }
}