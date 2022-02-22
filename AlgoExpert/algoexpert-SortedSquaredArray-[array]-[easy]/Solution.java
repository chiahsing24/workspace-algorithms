import java.util.*;

class Program {

  public int[] sortedSquaredArray(int[] array) {
    // Write your code here.
		int[] result = new int[array.length];
		int cur = array.length - 1;
		int start = 0, end = array.length - 1;
		while (start <= end) {
			if (Math.abs(array[start]) > Math.abs(array[end])) {
				result[cur] = array[start] * array[start];
				start++;
			} else {
				result[cur] = array[end] * array[end];
				end--;
			}
			cur--;
		}
		
    return result;
  }
}
