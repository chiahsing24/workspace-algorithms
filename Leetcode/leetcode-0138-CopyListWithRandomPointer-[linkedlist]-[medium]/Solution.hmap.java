/*
// Definition for a Node.
class Node {
    int val;
    Node next;
    Node random;

    public Node(int val) {
        this.val = val;
        this.next = null;
        this.random = null;
    }
}
*/

class Solution {
    public Node copyRandomList(Node head) {
        if (head == null) return null;
        
        Node cur = head;
        HashMap<Node, Node> map = new HashMap<>();
        
        drawMap(cur, map);
        createNewList(cur, map);
        
        return map.get(cur);
    }
    
    public void drawMap(Node head, HashMap<Node, Node> map) {
        Node cur = head;
        while (cur != null) {
            Node node = new Node(cur.val);
            map.put(cur, node);
            cur = cur.next;
        }
    }
    
    public void createNewList(Node head, HashMap<Node, Node> map) {
        Node cur = head;
        while (cur != null) {
            Node newCur = map.get(cur);
            Node next = cur.next;
            Node random = cur.random;

            if (next != null) {
                newCur.next = map.get(next);
            }
            
            if (random != null) {
                newCur.random = map.get(random);
            }
            
            cur = cur.next;
        }
    }
}