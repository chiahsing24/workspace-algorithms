public class Solution {
    public int getMax(int[] array) {
        int max = Integer.MIN_VALUE;
        for(int n : array){
            max = Math.max(max, n);
        }
        return max;
    }
}