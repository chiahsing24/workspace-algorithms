class Solution {
    public void merge(int[] nums1, int m, int[] nums2, int n) {
        if (m == 0) {
            for (int i = 0; i < n; i++) {
                nums1[i] = nums2[i];
            }
        } 
        
        if (m > 0 && n > 0) {
            int leftPtr = m - 1, rightPtr = n - 1;
            for (int i = m + n - 1; i >= 0; i--) {
                if (leftPtr >= 0 && rightPtr >= 0) {
                    if (nums1[leftPtr] > nums2[rightPtr]) {
                        nums1[i] = nums1[leftPtr--];
                    } else {
                        nums1[i] = nums2[rightPtr--];
                    }
                } else if (leftPtr >= 0) {
                    nums1[i] = nums1[leftPtr--];
                } else if (rightPtr >= 0) {
                    nums1[i] = nums2[rightPtr--];
                }
            }
        }
    }
}