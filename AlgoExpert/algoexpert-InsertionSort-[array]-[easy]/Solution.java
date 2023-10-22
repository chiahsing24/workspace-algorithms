import java.util.*;

class Program {
  public static int[] insertionSort(int[] array) {
    // Write your code here.
    if (array.length < 2) {
      return array;
    }

    for (int i = 1; i < array.length; i++) {
      int curVal = array[i];
      int targetIndex = i;
      for (int j = i - 1; j >= 0; j--) {
        if (array[j] > curVal) {
          array[j + 1] = array[j];
          targetIndex = j;
        } 
      }

      array[targetIndex] = curVal;
    }

    return array;
  }
}