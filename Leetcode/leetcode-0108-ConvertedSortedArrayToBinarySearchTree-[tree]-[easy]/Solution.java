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
    public TreeNode sortedArrayToBST(int[] nums) {
        TreeNode root = buildBST(null, nums, 0, nums.length - 1);
        return root;
    }

    public TreeNode buildBST(TreeNode root, int[] nums, int left, int right) {
        if (left > right) {
            return null;
        }

        int mid = left + (right - left) / 2;
        int midVal = nums[mid];
        if (root == null) {
            root = new TreeNode(midVal);
        }

        root.left = buildBST(root.left, nums, left, mid - 1);
        root.right = buildBST(root.right, nums, mid + 1, right);

        return root;
    }
}