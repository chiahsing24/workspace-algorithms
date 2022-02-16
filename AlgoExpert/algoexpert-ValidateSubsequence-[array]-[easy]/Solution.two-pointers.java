import java.util.*;

class Program {
  public static boolean isValidSubsequence(List<Integer> array, List<Integer> sequence) {
    // Write your code here.
		int m = array.size();
		int n = sequence.size();
		if (n > m) return false;
		
		int start = 0;
		for (int i = 0; i < n; i++) {
			int preStart = start;
			for (int j = start; j < m; j++) {
				if (array.get(j) == sequence.get(i)) {
					start = j + 1;
					break;
				}	
			}
			
			if (start == preStart) return false;
		}
    return true;
  }
}
