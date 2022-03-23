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
    public List<Integer> getLonelyNodes(TreeNode root) {
        List<Integer> result = new ArrayList<>();
        
        Queue<TreeNode> queue = new LinkedList<>();
        queue.offer(root);
        while (!queue.isEmpty()) {
            int size = queue.size();
            for (int i = 0; i < size; i++) {
                TreeNode cur = queue.poll();

                if (cur.left != null && cur.right != null) {
                    queue.offer(cur.left);
                    queue.offer(cur.right);
                } else if (cur.left != null) {
                    queue.offer(cur.left);
                    result.add(cur.left.val);
                } else if (cur.right != null) {
                    queue.offer(cur.right);
                    result.add(cur.right.val);
                }
            }
        }
        
        return result;
    }
}