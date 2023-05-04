class Solution {
    public boolean isPowerOfThree(int n) {
        if (n > 0 && (Math.log10(n) / Math.log10(3)) % 1 == 0) {
            return true;
        }

        return false;
    }
}

/**
        loga(b) = log10 (b) / log10 (a)
 */