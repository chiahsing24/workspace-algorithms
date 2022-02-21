class Solution {
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        if (nums1.length > nums2.length) {
            return findMedianSortedArrays(nums2, nums1);
        }   
        
        int size1 = nums1.length; // 可切割位置個數
        int size2 = nums2.length; // 可切割位置個數
        
        int low = 0;
        int high = size1;
        while (low <= size1) {
            int partition1 = low + (high - low) / 2;
            int partition2 = (size1 + size2 + 1) / 2 - partition1; //如果總和是偶數個, 平均分配, 奇數個讓左半部比右半部多一個
            
            int maxLeft1 = (partition1 == 0) ? Integer.MIN_VALUE : nums1[partition1 - 1];
            int minRight1 = (partition1 == size1) ? Integer.MAX_VALUE : nums1[partition1];
            
            int maxLeft2 = (partition2 == 0) ? Integer.MIN_VALUE : nums2[partition2 - 1];
            int minRight2 = (partition2 == size2) ? Integer.MAX_VALUE : nums2[partition2];
            
            if (maxLeft1 <= minRight2 && maxLeft2 <= minRight1) {
                if ((size1 + size2) % 2 == 0) {
                    return (double) (Math.max(maxLeft1, maxLeft2) + Math.min(minRight1, minRight2)) / 2;
                } else {
                    return (double) Math.max(maxLeft1, maxLeft2); // 由於左半部會比右半部多一個, 所以返回左半部較大值
                }
            } else if (maxLeft1 > minRight2) {
                high = partition1 - 1;
            } else {
                low = partition1 + 1;
            }
        }
        return Double.MIN_VALUE;
    }
}