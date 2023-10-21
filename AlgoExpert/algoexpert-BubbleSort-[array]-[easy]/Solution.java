import java.util.*;

class Program {
  public static int[] bubbleSort(int[] array) {
    int rounds = 0;
    while (rounds < array.length - 1) {
      for (int i = 0; i < array.length - 1 - rounds; i++) {
        if (array[i] > array[i + 1]) {
          swap(i, i + 1, array);
        }
      }

      rounds++;
    }

    return array;
  }

  public static void swap(int i, int j, int[] array) {
    int temp = array[i];
    array[i] = array[j];
    array[j] = temp;
  }
}