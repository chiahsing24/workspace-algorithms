/*
// Definition for a Node.
class Node {
    public int val;
    public List<Node> children;

    public Node() {}

    public Node(int _val) {
        val = _val;
    }

    public Node(int _val, List<Node> _children) {
        val = _val;
        children = _children;
    }
};
*/

class Solution {
    public List<Integer> postorder(Node root) {
        List<Integer> result = new ArrayList<>();
        if (root == null) return result;
        traverse(root, result);
        return result;
    }
    
    public void traverse(Node root, List<Integer> result) {
        if (root == null) return;
        
        List<Node> curLevel = root.children;
        for (Node node : curLevel) {
            traverse(node, result);
        }
        
        result.add(root.val);
    }
}