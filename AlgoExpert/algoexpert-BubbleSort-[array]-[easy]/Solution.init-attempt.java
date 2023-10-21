import java.util.*;

class Program {
  public static int[] bubbleSort(int[] array) {
    // Write your code here.
    int rounds =  array.length - 1;
    while (rounds > 0) {
      int i = 0; 
      int j = 1;
      while (j <= rounds) {
        if (array[i] > array[j]) {
          int largerNum = array[i];
          array[i] = array[j];
          array[j] = largerNum;
        }

        i++;
        j++;
      }

      rounds--;
    }
    
    return array;
  }
}