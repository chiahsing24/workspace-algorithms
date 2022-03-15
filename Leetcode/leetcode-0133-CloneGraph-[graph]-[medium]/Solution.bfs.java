/*
// Definition for a Node.
class Node {
    public int val;
    public List<Node> neighbors;
    public Node() {
        val = 0;
        neighbors = new ArrayList<Node>();
    }
    public Node(int _val) {
        val = _val;
        neighbors = new ArrayList<Node>();
    }
    public Node(int _val, ArrayList<Node> _neighbors) {
        val = _val;
        neighbors = _neighbors;
    }
}
*/

class Solution {
    public Node cloneGraph(Node node) {
        if (node == null) {
            return null;
        }
        
        List<Node> nodes = findAllNodes(node);
        Map<Node, Node> oldNewMapping = createNodesMapping(nodes);
        createNewGraphLinking(nodes, oldNewMapping);
        
        return oldNewMapping.get(node);
    }
    
    public List<Node> findAllNodes(Node root) {
        HashSet<Node> set = new HashSet<>();
        Queue<Node> queue = new LinkedList<>();
        
        queue.offer(root);
        set.add(root);
        while (!queue.isEmpty()) {
            Node cur = queue.poll();
            for (Node neighbor : cur.neighbors) {
                if (!set.contains(neighbor)) {
                    queue.offer(neighbor);
                    set.add(neighbor);
                }                
            }
        }

        return new ArrayList<Node>(set);
    }
    
    public Map<Node, Node> createNodesMapping(List<Node> nodes) {
        Map<Node, Node> oldNewMapping = new HashMap<>();
        for (int i = 0; i < nodes.size(); i++) {
            oldNewMapping.put(nodes.get(i), new Node(nodes.get(i).val));
        }

        return oldNewMapping;
    }
    
    public void createNewGraphLinking(List<Node> nodes, Map<Node, Node> oldNewMapping) {
        for (int i = 0; i < nodes.size(); i++) {
            Node newNode = oldNewMapping.get(nodes.get(i));
            for (Node neighbor : nodes.get(i).neighbors) {
                newNode.neighbors.add(oldNewMapping.get(neighbor));
            }
        }
    }
}