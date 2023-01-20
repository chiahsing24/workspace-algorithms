/**
    A math trick can be applied to solve this question
    (ex) [1, 1, 1, 1] <= 6 pairs, which is n * (n - 1) / 2
    (ex) [1, 1, 1] <= 3 pairs, which is 3 * 2 / 2
 */
class Solution {
    public int numIdenticalPairs(int[] nums) {
        int[] freq = new int[101];
        for (int num : nums) {
            freq[num]++;
        }

        int cnt = 0;
        for (int i = 1; i < freq.length; i++) {
            cnt += (freq[i] * (freq[i] - 1)) / 2;
        }

        return cnt;
    }
}