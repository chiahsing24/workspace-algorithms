public class Solution {
    /**
     * @param n: an integer
     * @return: return an integer
     */
    public long reverseBits(long n) {
        // write your code here
        return reverseBits(n, 32);
    }

    public long reverseBits(long n, int numOfDigits) {
        if (numOfDigits == 1) {
            return n;
        }

        long rightMost = n & 1;
        long nextCallResult = reverseBits(n >> 1, numOfDigits - 1);
        long result = (rightMost << (numOfDigits - 1)) + nextCallResult;
        return result;
    }
}