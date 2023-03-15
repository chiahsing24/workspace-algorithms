public class Solution {
    /**
     * @param pages: an array of integers
     * @param k: An integer
     * @return: an integer
     */
    public int copyBooks(int[] pages, int k) {
        if (pages == null || pages.length == 0) {
            return 0;
        }
        // 當k == length of pages, start最小值至少要是pages中最大值
        int start = getMaxPages(pages);
        int end = getTotalPages(pages);
        while (start + 1 < end) {
            int mid = start + (end - start) / 2;
            if (numberOfWorkersNeeded(pages, mid) <= k) {
                end = mid;
            } else {
                start = mid;
            }
        }

        if (numberOfWorkersNeeded(pages, start) <= k) {
            return start;
        }

        return end;
    }

    private int getTotalPages(int[] pages) {
        int sum = 0;
        for (int i = 0; i < pages.length; i++) {
            sum += pages[i];
        }
        return sum;
    }

    private int getMaxPages(int[] pages) {
        int max = 0;
        for (int i = 0; i < pages.length; i++) {
            max = Math.max(max, pages[i]);
        }
        return max;
    }

    private int numberOfWorkersNeeded(int[] pages, int limit) {
        int count = 0;
        int sum = 0;
        for (int i = 0; i < pages.length; i++) {
            if (sum + pages[i] > limit) {
                sum = pages[i];
                count++;
            } else {
                sum += pages[i];
            }
        }
        count++;
        return count;
    }
}