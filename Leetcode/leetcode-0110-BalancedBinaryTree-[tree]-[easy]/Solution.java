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
class AdvTreeNode {
    public boolean isBalanced;
    public int treeHeight;
    
    AdvTreeNode(boolean isBalanced, int treeHeight) {
        this.isBalanced = isBalanced;
        this.treeHeight = treeHeight;
    }
}


class Solution {
    public boolean isBalanced(TreeNode root) {
        if (root == null) return true;
        
        AdvTreeNode node = checkTree(root);
        if (node.isBalanced) {
            return true;
        }
        return false;
    }
    
    public AdvTreeNode checkTree(TreeNode root) {
        if (root == null) {
            return new AdvTreeNode(true, 0);
        }
        
        AdvTreeNode left = checkTree(root.left);
        AdvTreeNode right = checkTree(root.right);
        boolean isBalanced = left.isBalanced && right.isBalanced && Math.abs(left.treeHeight - right.treeHeight) < 2;
        
        return new AdvTreeNode(isBalanced, Math.max(left.treeHeight, right.treeHeight) + 1);
    }
}