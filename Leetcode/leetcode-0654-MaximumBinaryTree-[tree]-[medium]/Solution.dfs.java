/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode() {}
 *     TreeNode(int val) { this.val = val; }
 *     TreeNode(int val, TreeNode left, TreeNode right) {
 *         this.val = val;
 *         this.left = left;
 *         this.right = right;
 *     }
 * }
 */
class Solution {
    public TreeNode constructMaximumBinaryTree(int[] nums) {
        if (nums == null || nums.length == 0) return null;
        
        return buildTree(nums, 0, nums.length - 1);
    }
    
    public TreeNode buildTree(int[] nums, int start, int end) {        
        int maxVal = Integer.MIN_VALUE;
        int maxValIdx = start;
        for (int i = start; i <= end; i++) {
            if (nums[i] > maxVal) {
                maxVal = nums[i];
                maxValIdx = i;
            }    
        }
        
        TreeNode root = new TreeNode(maxVal);
        if (maxValIdx != start) {
            root.left = buildTree(nums, start, maxValIdx - 1);
        }
        
        if (maxValIdx != end) {
            root.right = buildTree(nums, maxValIdx + 1, end);
        }
        
        return root;
    }
}