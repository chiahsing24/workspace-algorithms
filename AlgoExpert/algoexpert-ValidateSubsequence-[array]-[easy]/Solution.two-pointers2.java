import java.util.*;

class Program {
  public static boolean isValidSubsequence(List<Integer> array, List<Integer> sequence) {
		int arrPtr = 0;
		int seqPtr = 0;
		while (arrPtr < array.size() && seqPtr < sequence.size()) {
			if (array.get(arrPtr).equals(sequence.get(seqPtr))) {
				seqPtr++;
			}
			arrPtr++;
		}
		return seqPtr == sequence.size();
  }
}
