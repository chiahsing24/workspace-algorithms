class Solution {
    public int kthFactor(int n, int k) {
        int sqrtN = ((int) Math.sqrt(n));
        ArrayList<Integer> smalls = new ArrayList<>();
        ArrayList<Integer> bigs = new ArrayList<>();
        for (int i = 1; i <= sqrtN; i++) {
            if (n % i == 0) {
                if (i == n / i) {
                    smalls.add(i);
                } else {
                    smalls.add(Math.min(i, n / i));
                    bigs.add(Math.max(i, n / i));
                }
            }
        }

        if (k > smalls.size() + bigs.size()) {
            return -1;
        } else if (k <= smalls.size()) {
            return smalls.get(k - 1);
        } else {
            int nFromLast = k - smalls.size();
            return bigs.get(bigs.size() - nFromLast);
        }
    }
}