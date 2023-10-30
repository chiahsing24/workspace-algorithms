import java.util.*;

class Program {
  public static int nodeDepths(BinaryTree root) {
    // Write your code here.
    if (root == null) {
      return 0;
    }

    int depthSum = 0;
    int curDepth = 0;
    Queue<BinaryTree> queue = new LinkedList<>();
    queue.add(root);

    while (!queue.isEmpty()) {
      int size = queue.size();
      curDepth++;
      
      while (size > 0) {
        BinaryTree cur = queue.remove();
        if (cur.left != null) {
          depthSum = depthSum + curDepth;
          queue.add(cur.left);
        }

        if (cur.right != null) {
          depthSum = depthSum + curDepth;
          queue.add(cur.right);
        }

        size--;
      }
    }

    return depthSum;
  }

  static class BinaryTree {
    int value;
    BinaryTree left;
    BinaryTree right;

    public BinaryTree(int value) {
      this.value = value;
      left = null;
      right = null;
    }
  }
}