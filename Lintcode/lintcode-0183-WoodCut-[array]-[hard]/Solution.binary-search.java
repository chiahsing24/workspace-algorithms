public class Solution {
    /**
     * @param L: Given n pieces of wood with length L[i]
     * @param k: An integer
     * @return: The maximum length of the small pieces
     */
    public int woodCut(int[] L, int k) {
        // write your code here
        if (L == null || L.length == 0) {
            return 0;
        }
        
        int maxLength = Integer.MIN_VALUE;
        for (int length : L) {
            maxLength = Math.max(maxLength, length);
        }
        
        // 坑點2: 切割長度至少為1
        int start = 1, end = maxLength;
        while (start + 1 < end) {
            int mid = start + (end - start) / 2;
            if (generateNPieces(L, mid) >= k) {
                start = mid;
            } else {
                end = mid;
            }
        }

        if (generateNPieces(L, end) >= k) {
            return end;
        } else if (generateNPieces(L, start) >= k) {
            return start;
        } else {
            return 0;
        }
    }

    public int generateNPieces(int[] L, int size) {
        int cnt = 0;
        for (int length : L) {
            cnt += (length / size);
            // 坑點2:  下面這邊不需要if, 因為題目是要k pieces of 等長wood
            // if (length % size > 0) {
            //     cnt++;
            // }
        }
        return cnt;
    }
}