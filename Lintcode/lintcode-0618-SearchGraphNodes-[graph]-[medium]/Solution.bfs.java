/**
 * Definition for graph node.
 * class UndirectedGraphNode {
 *     int label;
 *     ArrayList<UndirectedGraphNode> neighbors;
 *     UndirectedGraphNode(int x) { 
 *         label = x; neighbors = new ArrayList<UndirectedGraphNode>(); 
 *     }
 * };
 */


public class Solution {
    /*
     * @param graph: a list of Undirected graph node
     * @param values: a hash mapping, <UndirectedGraphNode, (int)value>
     * @param node: an Undirected graph node
     * @param target: An integer
     * @return: a node
     */
    public UndirectedGraphNode searchNode(ArrayList<UndirectedGraphNode> graph,
                                          Map<UndirectedGraphNode, Integer> values,
                                          UndirectedGraphNode node,
                                          int target) {
        // write your code here
        if (node == null) return node;

        Set<UndirectedGraphNode> visited = new HashSet<>();
        Queue<UndirectedGraphNode> queue = new LinkedList<>();

        visited.add(node);
        queue.offer(node);
        while (!queue.isEmpty()) {
            UndirectedGraphNode cur = queue.poll();
            if (values.get(cur) == target) {
                return cur;
            }
            for (UndirectedGraphNode neighbor : cur.neighbors) {
                if (!visited.contains(neighbor)) {
                    queue.offer(neighbor);
                    visited.add(neighbor);
                }
            }
        }

        return null;
    }
}