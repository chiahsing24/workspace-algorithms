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
    public List<String> binaryTreePaths(TreeNode root) {
        List<String> result = new ArrayList<>();
        if (root == null) {
            return result;
        }
        
        result = traverse(root);
        return result;
    }
    
    private List<String> traverse(TreeNode root) {
        List<String> result = new ArrayList<>();
        if (root == null) {
            return result;
        }
        
        List<String> left = traverse(root.left);
        List<String> right = traverse(root.right);
        
        if (left.size() == 0 && right.size() == 0) {
            result.add(String.valueOf(root.val));
        } else {
            for (int i = 0; i < left.size(); i++) {
                result.add(String.valueOf(root.val) + "->" + left.get(i));
            }
            
            for (int i = 0; i < right.size(); i++) {
                result.add(String.valueOf(root.val) + "->" + right.get(i));
            }
        }
        return result;
    }
}