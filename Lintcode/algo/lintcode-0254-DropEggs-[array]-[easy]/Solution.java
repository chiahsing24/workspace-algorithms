public class Solution {
    /**
     * @param n: An integer
     * @return: The sum of a and b
     */
    public int dropEggs(int n) {
        // write your code here
        // 找適當的step, 讓樹平衡以減少drop次數
        // x + (x - 1) + (x - 2) + ... + 1 >= n
        // x * (x + 1) / 2 >= n
        long start = 0, end = n;
        while (start + 1 < end) {
            long mid = start + (end - start) / 2;
            if (mid * (mid + 1) / 2 >= n) {
                end = mid;
            } else {
                start = mid;
            }
        } 

        if (start * (start + 1) / 2 >= n) {
            return (int) start;
        } else {
            return (int) end;
        }
    }
}