public class Solution {
    /**
     * @param A: an integer array
     * @param target: An integer
     * @param k: An integer
     * @return: an integer array
     */
    public int[] kClosestNumbers(int[] A, int target, int k) {
        // write your code here
        if (k > A.length || k == 0) {
            return new int[0];
        }

        int start = 0, end = A.length - 1;
        while (start + 1 < end) {
            int mid = start + (end - start) / 2;
            if (A[mid] > target) {
                end = mid;
            } else {
                start = mid;
            }
        }

        int index = -1;
        if (Math.abs(target - A[start]) < Math.abs(A[end] - target)) {
            index = start;
        } else if (Math.abs(target - A[start]) > Math.abs(A[end] - target)) {
            index = end;
        } else {
            index = start;
        }

        int cnt = 0;
        ArrayList<Integer> temp = new ArrayList<>();
        temp.add(A[index]);
        cnt++;
        int left = index - 1, right = index + 1;
        while (cnt < k) {
            if ((left >= 0 && left <= A.length - 1) && (right >= 0 && right <= A.length - 1)) {
                if (Math.abs(target - A[left]) < Math.abs(A[right] - target)) {
                    temp.add(A[left]);
                    left--;
                } else if (Math.abs(target - A[left]) > Math.abs(A[right] - target)) {
                    temp.add(A[right]);
                    right++;
                } else {
                    temp.add(A[left]);
                    left--;
                }
            } else if (left < 0 || left > A.length - 1) {
                temp.add(A[right]);
                right++;
            } else {
                temp.add(A[left]);
                left--;
            }
            cnt++;
        }

        int[] result = new int[k];
        for (int i = 0; i < temp.size(); i++) {
            result[i] = temp.get(i);
        }
        return result;
    }
}