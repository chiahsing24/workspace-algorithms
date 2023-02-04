class Solution {
    public int shipWithinDays(int[] weights, int days) {
        int left = -1;
        int right = 0;
        for (int weight : weights) {
            left = Math.max(left, weight);
            right += weight;
        }

        while (left + 1 < right) {
            int mid = left + (right - left) / 2;
            if (daysNeeded(weights, mid) > days) {
                left = mid;
            } else {
                right = mid;
            }
        }
        
        if (daysNeeded(weights, left) <= days) {
            return left;
        } 

        return right;
    }

    public int daysNeeded(int[] weights, int capacity) {
        int days = 1;
        int curLoad = 0;
        for (int i = 0; i < weights.length; i++) {
            if (weights[i] + curLoad <= capacity) {
                curLoad += weights[i];
            } else {
                curLoad = weights[i];
                days++;
            }
        }

        return days;
    }
}