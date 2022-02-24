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
    public TreeNode constructFromPrePost(int[] preorder, int[] postorder) {
        if (preorder == null || postorder == null || preorder.length == 0 || postorder.length == 0 || preorder.length != postorder.length) {
            return null;
        }
        
        return buildTree(preorder, 0, preorder.length - 1, postorder, 0, postorder.length - 1);
    }
    
    public TreeNode buildTree(int[] preorder, int preStart, int preEnd, int[] postorder, int postStart, int postEnd) {
        if (preStart > preEnd) {
            return null;
        }
        
        if (postStart > postEnd) {
            return null;
        }
        
        if (preorder[preStart] != postorder[postEnd]) {
            return null;
        }
        
        int rootVal = preorder[preStart];
        TreeNode root = new TreeNode(rootVal);
        
        if (preStart == preEnd || postStart == postEnd) { // 避免找子樹根值時越界
            return root;
        }
        
        int subtreeRootVal = preorder[preStart + 1]; 
        int subtreeRootValIdxPostorder = findIdx(postorder, subtreeRootVal, postStart, postEnd);
        int numLeftDiff = subtreeRootValIdxPostorder - postStart + 1;
        int numRightDiff = postEnd - subtreeRootValIdxPostorder - 1;
        root.left = buildTree(preorder, preStart + 1, preStart + numLeftDiff, postorder, postStart, postStart + numLeftDiff - 1);
        root.right = buildTree(preorder, preStart + numLeftDiff + 1, preEnd, postorder, postStart + numLeftDiff, postEnd - 1);
        
        return root;
    }
    
    public int findIdx(int[] postorder, int val, int postStart, int postEnd) {
        for (int i = postStart; i <= postEnd; i++) {
            if (val == postorder[i]) {
                return i;
            }
        }
        return -1;
    }
}