class Solution {
    public boolean isPowerOfTwo(int n) {
        int setBitCount = 0;
        int pos = 0;
        while (pos < 31) {
            setBitCount += (n & (1 << pos)) == n ? 1 : 0;
            pos++;
        }

        return setBitCount == 1;
    }
}

/**
    2 =     00000001
    4 =     00000010
    8 =     00000100
    16 =    00001000
    ...
 */