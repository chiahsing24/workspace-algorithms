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
    public List<List<Integer>> pathSum(TreeNode root, int targetSum) {
        List<List<Integer>> result = new ArrayList<>();
        if (root == null) return result;
        
        List<Integer> cur = new ArrayList<>();
        
        checkTree(root, targetSum, result, cur);
        
        return result;
    }
    
    public void checkTree(TreeNode root, int targetSum, List<List<Integer>> result, List<Integer> cur) {
        if (root == null) return;
        
        cur.add(root.val); 
        if (root.left == null && root.right == null && targetSum - root.val == 0) {
            result.add(new ArrayList<>(cur));
        } else {        
            checkTree(root.left, targetSum - root.val, result, cur);
            checkTree(root.right, targetSum - root.val, result, cur);
        }
        cur.remove(cur.size() - 1);
    }
}