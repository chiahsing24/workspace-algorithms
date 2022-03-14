/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode(int x) { val = x; }
 * }
 */
public class Codec {

    // Encodes a tree to a single string.
    public String serialize(TreeNode root) {
        if (root == null) return "";
        StringBuilder sb = new StringBuilder();
        Queue<TreeNode> queue = new LinkedList<>();
        queue.offer(root);
        while (!queue.isEmpty()) {
            int curQueueSize = queue.size();
            for (int i = 0; i < curQueueSize; i++) {
                TreeNode cur = queue.poll();   
                if (sb.length() != 0) {
                    sb.append(',');
                }
                
                if (cur == null) {
                    sb.append("null");
                } else {
                    sb.append(cur.val);
                    queue.offer(cur.left);
                    queue.offer(cur.right);
                }
            }
        }
        return sb.toString();
    }

    // Decodes your encoded data to tree.
    public TreeNode deserialize(String data) {
        if (data.equals("")) return null;
        String[] input = data.split(",");
        TreeNode root = new TreeNode(Integer.parseInt(input[0]));
        Queue<TreeNode> queue = new LinkedList<>();
        queue.offer(root);
        int i = 1;
        while (!queue.isEmpty() && i < input.length) {
            int curLevelNumNodes = queue.size();
            int nextLevelNumNodes = curLevelNumNodes * 2;
            TreeNode cur = queue.poll(); 
            if (cur != null) {
                if (!input[i].equals("null")) {
                    TreeNode leftChild = new TreeNode(Integer.parseInt(input[i]));
                    cur.left = leftChild;
                    queue.offer(leftChild);
                } else {
                    cur.left = null;
                    queue.offer(null);
                }
                i++;
                    
                if (!input[i].equals("null")) {
                    TreeNode rightChild = new TreeNode(Integer.parseInt(input[i]));
                    cur.right = rightChild;
                    queue.offer(rightChild);
                } else {
                    cur.right = null;
                    queue.offer(null);
                }
                i++;
            }
        }
        return root;
    }
}

// Your Codec object will be instantiated and called as such:
// Codec ser = new Codec();
// Codec deser = new Codec();
// TreeNode ans = deser.deserialize(ser.serialize(root));