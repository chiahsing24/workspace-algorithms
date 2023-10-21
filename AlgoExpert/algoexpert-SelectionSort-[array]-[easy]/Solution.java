import java.util.*;

class Program {
  public static int[] selectionSort(int[] array) {
    for (int i = 0; i < array.length - 1; i++) {
      int minIndex = i;
      int tempMin = array[i];
      for (int j = i + 1; j < array.length; j++) {
        if (array[j] < tempMin) {
          tempMin = array[j];
          minIndex = j;
        }
      }

      if (minIndex != i) {
        swap(i, minIndex, array);
      }
    }

    return array;
  }

  public static void swap(int i, int j, int[] array) {
    int temp = array[i];
    array[i] = array[j];
    array[j] = temp;
  }
}