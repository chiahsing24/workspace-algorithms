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
    public TreeNode buildTree(int[] preorder, int[] inorder) {
        if (preorder == null || inorder == null || preorder.length != inorder.length) {
            return null;
        }
        
        return convertArrayToTree(preorder, 0, preorder.length - 1, inorder, 0, inorder.length - 1);
    }
    
    public TreeNode convertArrayToTree(int[] preorder, int preLeft, int preRight, int[] inorder, int inLeft, int inRight) {
        if (preLeft > preRight) return null;
        
        int rootVal = preorder[preLeft];
        TreeNode root = new TreeNode(rootVal);
        
        if (preLeft == preRight) return root;
        
        int inorderRootValIndex = 0;
        while (rootVal != inorder[inorderRootValIndex]) {
            inorderRootValIndex++;
        }
        
        root.left = convertArrayToTree(preorder, preLeft + 1, preLeft + inorderRootValIndex - inLeft, inorder, inLeft, inorderRootValIndex - 1);
        root.right = convertArrayToTree(preorder, preLeft + inorderRootValIndex - inLeft + 1, preRight, inorder, inorderRootValIndex + 1, inRight);
        
        return root;
    }
}