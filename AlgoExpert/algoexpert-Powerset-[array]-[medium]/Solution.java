import java.util.*;

class Program {
  public static List<List<Integer>> powerset(List<Integer> array) {
    // Write your code here.
    List<List<Integer>> result = new ArrayList<>();
    powerset(array, new ArrayList<Integer>(), result);
    return result;
  }

  public static void powerset(List<Integer> input, List<Integer> subset, List<List<Integer>> result) {
    result.add(new ArrayList<Integer>(subset));
    
    for (int i = 0; i < input.size(); i++) {
      subset.add(input.get(i));
      List<Integer> newInput = new ArrayList<Integer>(input);
      if (i + 1 < input.size()) {
        newInput = newInput.subList(i + 1, newInput.size());
        powerset(newInput, subset, result);
      } else {
        powerset(new ArrayList<Integer>(), subset, result);
      }
      subset.remove(subset.size() - 1);
    }
  }
}
