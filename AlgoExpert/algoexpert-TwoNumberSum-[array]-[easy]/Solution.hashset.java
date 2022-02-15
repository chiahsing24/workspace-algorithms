import java.util.*;

class Program {
  public static int[] twoNumberSum(int[] array, int targetSum) {
    // Write your code here.
		Set<Integer> hashSet = new HashSet<>();
		for (int num : array) {
			if (hashSet.contains(targetSum - num)) {
				return new int[] {num, targetSum - num};
			} else {
				hashSet.add(num);
			}
		}
		
    return new int[0];
  }
}
