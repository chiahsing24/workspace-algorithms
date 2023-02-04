class Solution {
    public int minTime(int[] time, int m) {
        if (time.length < m) {
            return 0;
        }

        int left = 0;
        int right = 0;
        for (int num : time) {
            right += num;
        }

        while (left + 1 < right) {
            int mid = left + (right - left) / 2;
            if (canSolveAllWithThisTime(time, mid, m)) {
                right = mid;
            } else {
                left = mid;
            }
        }

        if (canSolveAllWithThisTime(time, left, m)) {
            return left;
        }

        if (canSolveAllWithThisTime(time, right, m)) {
            return right;
        }

        return -1;
    }

    public boolean canSolveAllWithThisTime(int[] time, int timePerDay, int m) {
        int maxVal = 0;
        int sum = 0;
        int cnt = 0;
        for(int t : time){
            sum += t;
            maxVal = Math.max(maxVal, t);
            if(sum - maxVal > timePerDay){
                if(++cnt >= m) return false;
                sum = t;
                maxVal = t;
            }
        }
        return true;
    }
}