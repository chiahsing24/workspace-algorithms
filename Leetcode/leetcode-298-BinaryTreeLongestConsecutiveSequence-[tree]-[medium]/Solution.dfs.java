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
    public int longestConsecutiveLength = 1;
    
    public int longestConsecutive(TreeNode root) {
        if (root == null) return 0;
        traverse(root, root.left, 1);
        traverse(root, root.right, 1);
        return longestConsecutiveLength;
    }
    
    public void traverse(TreeNode parent, TreeNode cur, int curLongestLength) {
        if (cur == null) {
            curLongestLength = 0;
            return;
        }
        
        if (cur.val == parent.val + 1) {
            ++curLongestLength;
            longestConsecutiveLength = Math.max(longestConsecutiveLength, curLongestLength);
        } else {
            curLongestLength = 1;
        }
        
        if (cur.left != null) {
            traverse(cur, cur.left, curLongestLength);
        }
        
        if (cur.right != null) {
            traverse(cur, cur.right, curLongestLength);
        }
        
        return;
    }
}