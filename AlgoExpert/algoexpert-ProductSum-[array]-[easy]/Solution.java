import java.util.*;

class Program {
  // Tip: You can use `element instanceof ArrayList` to check whether an item
  // is an array or an integer.
  public static int productSum(List<Object> array) {
    // Write your code here.
    return productSum(array, 1);
  }

  public static int productSum(List<Object> array, int level) {
    int sum = 0;
    for (int i = 0; i < array.size(); i++) {
      if (array.get(i) instanceof ArrayList) {
        @SuppressWarnings("unchecked")
        ArrayList<Object> ls = (ArrayList<Object>) array.get(i);
        sum += productSum(ls, level + 1);
      } else {
        sum += (int) array.get(i);
      }
    }
    
    return sum * level;
  }
}
