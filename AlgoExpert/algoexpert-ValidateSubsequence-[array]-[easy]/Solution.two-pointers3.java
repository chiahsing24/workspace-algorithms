import java.util.*;

class Program {
  public static boolean isValidSubsequence(List<Integer> array, List<Integer> sequence) {
		int seqPtr = 0;
		for (int val : array) {
			if (seqPtr == sequence.size()) {
				break;
			}
			
			if (sequence.get(seqPtr).equals(val)) {
				seqPtr++;
			}
		}
		
		return sequence.size() == seqPtr;
  }
}
