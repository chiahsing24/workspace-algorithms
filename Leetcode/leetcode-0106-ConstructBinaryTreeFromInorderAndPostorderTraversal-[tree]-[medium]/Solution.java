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
    public TreeNode buildTree(int[] inorder, int[] postorder) {
        if (inorder == null || postorder == null || inorder.length == 0 || postorder.length == 0 || inorder.length != postorder.length) {
            return null;
        }
        
        return buildTree(inorder, 0, inorder.length - 1, postorder, 0, postorder.length - 1);
    }
    
    public TreeNode buildTree(int[] inorder, int inStart, int inEnd, int[] postorder, int postStart, int postEnd) {
        if (postStart > postEnd) {
            return null;
        }
        
        int rootVal = postorder[postEnd];
        TreeNode root = new TreeNode(rootVal);
        if (postStart == postEnd) {
            return root;
        }
        
        int rootValIdxInorder = findIdx(inorder, rootVal, inStart, inEnd);
        int numLeftDiff = rootValIdxInorder - inStart;
        int numRightDiff = inEnd - rootValIdxInorder;
        root.left = buildTree(inorder, inStart, rootValIdxInorder - 1, postorder, postStart, postEnd - numRightDiff - 1);
        root.right = buildTree(inorder, rootValIdxInorder + 1, inEnd, postorder, postEnd - numRightDiff, postEnd - 1);
        
        return root;
    }
    
    public int findIdx(int[] inorder, int rootVal, int inStart, int inEnd) {
        for (int i = inStart; i <= inEnd; i++) {
            if (rootVal == inorder[i]) {
                return i;
            }
        }
        return -1;
    }
}
