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
class NodeState {
    public int sum;
    public int numNodes;

    NodeState(int sum, int numNodes) {
        this.sum = sum;
        this.numNodes = numNodes;
    }
}

public class Solution {
    /**
     * @param root: the root of binary tree
     * @return: the root of the maximum average of subtree
     */
    public NodeState maximumAveNodeState;
    public TreeNode maximumAveNode;

    public TreeNode findSubtree2(TreeNode root) {
        // write your code here
        if (root == null) return root;
        NodeState nodeState = traverse(root);
        return maximumAveNode;
    }

    public NodeState traverse(TreeNode root) {
        if (root == null) {
            return new NodeState(0, 0);
        }

        NodeState left = traverse(root.left);
        NodeState right = traverse(root.right);
        int numNodes = left.numNodes + right.numNodes + 1;
        int sum = left.sum + right.sum + root.val;
        NodeState nodeState = new NodeState(sum, numNodes);
        // sum / numNodes > maximumAveNodeState.sum / maximumAveNodeState.numNodes 
        if (maximumAveNode == null || (sum * maximumAveNodeState.numNodes > maximumAveNodeState.sum * numNodes)) {
            maximumAveNode = root;
            maximumAveNodeState = nodeState;
        }

        return nodeState;
    }
}