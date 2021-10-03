import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        // 1.
        int[] arr1 = new int[5];
        for (int i = 0; i < arr1.length; i++) {
            arr1[i] = i;
        }

        // 2.
        int[] arr2 = new int[]{1, 2, 3};

        // 3.
        int[] arr3 = new int[5];
        Arrays.fill(arr3, 5);
    }
}
