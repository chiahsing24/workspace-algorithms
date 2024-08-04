import java.util.*;

class Program {
  public static List<List<Integer>> getPermutations(List<Integer> array) {
    // Write your code here.
    List<List<Integer>> result = new ArrayList<>();
    ArrayList<Integer> perm = new ArrayList<>();
    getPermutations(array, result, perm);
    return result;
  }

  public static void getPermutations(List<Integer> input, List<List<Integer>> result, List<Integer> perm) {
    if (input.size() == 0 && perm.size() > 0) {
      result.add(perm);
    } else {
      for (int i = 0; i < input.size(); i++) {
        List<Integer> newInput = new ArrayList<Integer>(input);
        newInput.remove(i);
        List<Integer> newPerm = new ArrayList<Integer>(perm);
        newPerm.add(input.get(i));
        getPermutations(newInput, result, newPerm);
      }
    }
  }
}
