import java.util.*;

class Program {
  public static int[] twoNumberSum(int[] array, int targetSum) {
    // Write your code here.
		Arrays.sort(array);
		int left = 0;
		int right = array.length - 1;
		while (left < right) {
			int curSum = array[left] + array[right];
			if (curSum > targetSum) {
				right--;
			} else if (curSum < targetSum) {
				left++;
			} else {
				return new int[] {array[left], array[right]};
			}
		}
		
    return new int[0];
  }
}
