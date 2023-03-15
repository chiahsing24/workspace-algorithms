public class Solution {
    /**
     * @param reader: An instance of ArrayReader.
     * @param target: An integer
     * @return: An integer which is the first index of target.
     */
    public int searchBigSortedArray(ArrayReader reader, int target) {
        // write your code here
        int size = 1;
        while (reader.get(size) <= target) {
            size *= 2;
        }
        System.out.println("size: " + size);

        int start = 0, end = size - 1;
        while (start + 1 < end) {
            int mid = start + (end - start) / 2;
            if (target > reader.get(mid)) {
                start = mid;
            } else {
                end = mid;
            }
        }

        if (reader.get(start) == target) {
            return start;
        } else if (reader.get(end) == target) {
            return end;
        } else {
            return -1;
        }
    }
}