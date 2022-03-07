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
class State {
    TreeNode node;
    int cnt;
    
    public State(TreeNode node, int cnt) {
        this.node = node;
        this.cnt = cnt;
    }
}

class Solution {
    public List<Integer> postorderTraversal(TreeNode root) {
        Stack<State> stack = new Stack<>();
        stack.push(new State(root, 0));
        List<Integer> values = new ArrayList<>();
        
        while (!stack.isEmpty()) {
            State now = stack.pop();
            TreeNode node = now.node;
            int cnt = now.cnt;
            
            if (node == null) {
                continue;
            }
            
            if (cnt == 0) {
                stack.push(new State(node, 3));
                stack.push(new State(node.right, 0));
                stack.push(new State(node, 2));
                stack.push(new State(node.left, 0));
                stack.push(new State(node, 1));
            }
            
            if (cnt == 3) {
                values.add(node.val);
            }
        }
        
        return values;
    }
}