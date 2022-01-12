class Solution {
    public List<Integer> postorder(Node root) {
        LinkedList<Integer> result = new LinkedList<>();
        if (root == null) return result;
        
        Node cur = root;
        Stack<Node> stack = new Stack<>();
        stack.push(cur);
        while (!stack.isEmpty()) {
            cur = stack.pop(); 
            for (int i = 0; i < cur.children.size(); i++) {
                if (cur.children.get(i) != null) {
                    stack.push(cur.children.get(i));
                }
            }
            
            result.addFirst(cur.val); 
        }
        
        return result;
    }
}