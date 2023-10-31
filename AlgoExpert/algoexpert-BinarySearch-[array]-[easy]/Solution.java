import java.util.*;

class Program {
  public static int binarySearch(int[] array, int target) {
    // Write your code here.
    int left = 0, right = array.length - 1;
    while (left + 1 < right) {
      int mid = left + (right - left) / 2;
      if (target > array[mid]) {
        left = mid;
      } else {
        right = mid;
      }
    }

    if (array[left] == target) {
      return left;
    } else if (array[right] == target) {
      return right;
    }
    return -1;
  }
}
