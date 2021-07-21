public class Solution {
    public int[] rounding(int[] array) {
        // write your code here
        int length = array.length;
        int i = 0;
        while (i < length) {
            if (array[i] > 0) {
                if ((array[i] % 10) >= 5) {
                    array[i] = (array[i] + 10) - (array[i] % 10);
                } else {
                    array[i] = array[i] - (array[i] % 10);
                }
            }
            i++;
        }
        return array;
    }
}