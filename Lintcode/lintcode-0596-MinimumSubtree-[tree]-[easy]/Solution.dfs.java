/**
 * Definition of TreeNode:
 * public class TreeNode {
 *     public int val;
 *     public TreeNode left, right;
 *     public TreeNode(int val) {
 *         this.val = val;
 *         this.left = this.right = null;
 *     }
 * }
 */
class Info {
    int sum;

}

public class Solution {
    /**
     * @param root: the root of binary tree
     * @return: the root of the minimum subtree
     */
    private TreeNode minimumRoot = null;
    private int minimumSum = 0;

    public TreeNode findSubtree(TreeNode root) {
        // write your code here
        if (root == null) return root;
        traverse(root);
        return minimumRoot;
    }

    private int traverse(TreeNode root) {
        if (root == null) {
            return 0;
        }

        int left = traverse(root.left);
        int right = traverse(root.right);
        int sum = left + right + root.val;
        if (minimumRoot == null || sum < minimumSum) {
            minimumSum = sum;
            minimumRoot = root;
        }

        return sum;
    }
}