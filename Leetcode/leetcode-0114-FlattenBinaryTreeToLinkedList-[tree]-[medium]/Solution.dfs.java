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
    public void flatten(TreeNode root) {
        traverse(root);
    }
    
    public TreeNode traverse(TreeNode root) {
        if (root == null) return null;
        
        TreeNode leftChild = traverse(root.left);
        TreeNode rightChild = traverse(root.right);
        
        if (leftChild != null && rightChild != null) {
            TreeNode tempLeft = root.left;
            TreeNode tempRight = root.right;
            root.left = null;
            root.right = tempLeft;
            
            TreeNode rightMostChildLeaf = findRightMostChildLeaf(tempLeft);
            rightMostChildLeaf.right = tempRight;
            
            return root;
        }
        
        if (leftChild != null) {
            TreeNode tempLeft = root.left;
            root.left = null;
            root.right = tempLeft;
            return root;
        }
        
        if (rightChild != null) {
            return root;
        }
            
        return root;
    }
    
    public TreeNode findRightMostChildLeaf(TreeNode root) {
        TreeNode temp = root;
        while (root != null) {
            temp = root;
            root = root.right;
        }
        return temp;
    }
}