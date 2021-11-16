public class Solution {
    /**
     * @param nums: an array with positive and negative numbers
     * @param k: an integer
     * @return: the maximum average
     */
    public boolean isExist(int[] nums, int k, double avg) {
        double curSum = 0.0d; 
        for (int i = 0; i < k; i++) {
            curSum += nums[i] - avg;
        }
        if (curSum >= 0) {
            return true;
        }

        // minPrevSum: 目前為止, 所有前綴和中最小的前綴和
        double prevSum = 0.0d,  minPrevSum = 0.0d;
        for (int i = k; i <= nums.length - 1; i++) {
            curSum += nums[i] - avg;
            prevSum += nums[i - k] - avg;
            minPrevSum = Math.min(minPrevSum, prevSum);
            if (curSum - minPrevSum >= 0) {
                return true;
            }
        }

        return false;
    }

    public double maxAverage(int[] nums, int k) {
        // write your code here
        double start = Double.MAX_VALUE;
        double end = Double.MIN_VALUE;
        for (int i = 0; i < nums.length; i++) {
            start = Math.min(start, nums[i]);
            end = Math.max(end, nums[i]);
        }

        while (start + 1e-5 < end) {
            double mid = start + (end - start) / 2;
            if (isExist(nums, k, mid)) {
                start = mid;
            } else {
                end = mid;
            }
        }

        return start;
    }
}

/**
 * 此題非常重要, 以下為參考別人解法後整理的思路:
1. 找到array中, 最大及最小值, 因為一個array中的subarray的平均值可能的範圍就是由這兩個值來 決定的, 想想subarray的length若是1, 即可明白
2. 最大及最小值相當於我們接下來要做二分搜索的範圍, mid值等於是題目要我們求的最大平均值的candidate, 不斷地縮小這個candidate可行的範圍來找最大平均值
3. 如何判斷切左還切右呢? 轉換題目為在這個start,end範圍內, 能否有至少一組length >= k的subarray的平均值>=mid呢? 若有的話, 代表mid值太小, 下一次須取右半部, 以此類推
 */