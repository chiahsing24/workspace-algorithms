public class ArrayIntro03 {
    public static void main(String[] args) {
        int[] x;

        int[] y = {1, 2, 3};
    
        int[] z = new int[3];
        for (int num : z) {
            System.out.println("num: " + num);
        }

        z[0] = 10;
        z[1] = 11;
        z[2] = 12;

        int[][] a;
        int[][] b = new int[2][];

        int[][] c = {{1, 2, 3}, {4, 5}};
        for (int[] array: c) {
            for (int ele : array) {
                System.out.println(ele);
            }
        }
        
    }
}
