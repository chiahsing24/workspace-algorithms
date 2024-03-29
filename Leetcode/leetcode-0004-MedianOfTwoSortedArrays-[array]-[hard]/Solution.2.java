class Solution {
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        if (nums1.length > nums2.length) {
            int[] temp = nums1;
            nums1 = nums2;
            nums2 = temp;
        }

        int len1 = nums1.length;
        int len2 = nums2.length;
        int leftArrSize = (len1 + len2 + 1) / 2;
        int left = 0, right = len1;
        while (left < right) {
            int i = left + (right - left + 1) / 2;
            int j = leftArrSize - i;
            if (nums1[i - 1] > nums2[j]) {
                right = i - 1;
            } else {
                left = i;
            }
        }

        int i = left;
        int j = leftArrSize - i;
        int nums1Left = i == 0 ? Integer.MIN_VALUE : nums1[i - 1];
        int nums1Right = i == len1 ? Integer.MAX_VALUE : nums1[i];
        int nums2Left = j == 0 ? Integer.MIN_VALUE : nums2[j - 1];
        int nums2Right = j == len2 ? Integer.MAX_VALUE : nums2[j];

        if ((len1 + len2) % 2 == 0) {
            return (double) (Math.max(nums1Left, nums2Left) + Math.min(nums1Right, nums2Right)) / 2;
        } else {
            return (double) Math.max(nums1Left, nums2Left);
        }
    }
}