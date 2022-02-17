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
    public int preorderIndex;
    public HashMap<Integer, Integer> hmap = new HashMap<>();
    
    public TreeNode buildTree(int[] preorder, int[] inorder) {
        if (preorder == null || inorder == null || preorder.length != inorder.length) {
            return null;
        }
        
        preorderIndex = 0;
        for (int i = 0; i < inorder.length; i++) {
            hmap.put(inorder[i], i);
        }
        
        return convertArrayToTree(preorder, 0, inorder.length - 1);
    }
    
    public TreeNode convertArrayToTree(int[] preorder, int inLeft, int inRight) {
        if (inLeft > inRight) return null;
        
        int rootVal = preorder[preorderIndex++];
        TreeNode root = new TreeNode(rootVal);
        
        if (inLeft == inRight) return root;
        
        root.left = convertArrayToTree(preorder, inLeft, hmap.get(rootVal) - 1);
        root.right = convertArrayToTree(preorder, hmap.get(rootVal) + 1, inRight);
        
        return root;
    }
}