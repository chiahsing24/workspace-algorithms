/*
// Definition for a Node.
class Node {
    public int val;
    public Node left;
    public Node right;

    public Node() {}

    public Node(int _val) {
        val = _val;
    }

    public Node(int _val,Node _left,Node _right) {
        val = _val;
        left = _left;
        right = _right;
    }
};
*/

class Solution {
    public Node treeToDoublyList(Node root) {
        if (root == null) return root;
        Node newHead = traverse(root);
        Node newTail = findLastNode(root);
        newHead.left = newTail;
        newTail.right = newHead;
        return newHead;
    }
    
    public Node traverse(Node root) {
        if (root == null) return null;
        Node leftHead = traverse(root.left);
        Node rightHead = traverse(root.right);
        
        boolean isLeftOnlyNode = isOnlyNode(leftHead);
        boolean isRightOnlyNode = isOnlyNode(rightHead);
        
        Node leftLastNode = findLastNode(leftHead);
        
        if (leftHead != null && rightHead != null) {
            if (isLeftOnlyNode == true && isRightOnlyNode == true) {
                leftHead.right = root;
                root.left = leftHead;
                root.right = rightHead;
                rightHead.left = root;
                rightHead.right = null;
                leftHead.left = null;
            } else {
                leftLastNode.right = root;
                root.left = leftLastNode;
                root.right = rightHead;
                rightHead.left = root;
                leftHead.left = null;
            }
            return leftHead;
        }
        
        if (leftHead != null) {
            if (isLeftOnlyNode == true) {
                leftHead.right = root;
                root.left = leftHead;
                root.right = null;
                leftHead.left = null;
            } else {
                leftLastNode.right = root;
                root.left = leftLastNode;
                root.right = null;
                leftHead.left = null;
            }
            return leftHead;
        }
        
        if (rightHead != null) {
            root.right = rightHead;
            rightHead.left = root;
            return root;
        }
        
        return root;
    }
    
    public boolean isOnlyNode(Node root) {
        if (root == null) return false;
        if (root.left == null && root.right == null) {
            return true;
        }
        return false;
    }
    
    public Node findLastNode(Node root) {
        Node temp = root;
        while (root != null) {
            temp = root;
            root = root.right;
        }
        return temp;
    }
}