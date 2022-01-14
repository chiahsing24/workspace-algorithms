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
    public List<Integer> preorder(Node root) {
        List<Integer> result = new ArrayList<>();
        if (root == null) return result;
        
        Node cur = root;
        Stack<Node> stack = new Stack<>();
        stack.push(cur);
        while (!stack.isEmpty()) {
            cur = stack.pop();
            result.add(cur.val);
            for (int i = cur.children.size() - 1; i >= 0; i--) {
                if (cur.children.get(i) != null) {
                    stack.push(cur.children.get(i));
                }
            }
        }
        
        return result;
    }
}