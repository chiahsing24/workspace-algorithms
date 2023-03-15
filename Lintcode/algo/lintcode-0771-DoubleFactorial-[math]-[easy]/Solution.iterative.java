public class Solution {
    /**
     * @param n: the given number
     * @return:  the double factorial of the number
     */
     public long doubleFactorial(int n) { 
         return doubleFactorial(n, 1);
     }
    public long doubleFactorial(int n, long result) {
        // Write your code here
        while (true) {
            if (n <= 2) {
                return n * result;
            }

            int nextN = n - 2;
            long nextResult = n * result;
            n = nextN;
            result = nextResult;
        }
    }
}