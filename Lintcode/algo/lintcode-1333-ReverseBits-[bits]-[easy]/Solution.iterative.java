public class Solution {
    /**
     * @param n: an integer
     * @return: return an integer
     */
    public long reverseBits(long n) {
        // write your code here
        return reverseBits(n, 32, 0);
    }

    public long reverseBits(long n, int numOfDigits, long result) {
        while (true) {
            if (numOfDigits == 1) {
                return n + result;
            }

            long rightMost = n & 1;
            long newN = n >> 1;
            int newNumOfDigits = numOfDigits - 1;
            long newResult = result + (rightMost << (numOfDigits - 1));

            n = newN;
            numOfDigits = newNumOfDigits;
            result = newResult;
        }
    }
}