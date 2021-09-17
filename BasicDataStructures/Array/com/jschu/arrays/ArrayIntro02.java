public class ArrayIntro02 {
    public static void main(String[] args) {
        int[][] x = new int[3][];

        int[] y = new int[3];
        y[0] = 12;
        y[1] = 13;
        y[2] = 14;

        System.out.println(y[0]);
        System.out.println(y[1]);
        System.out.println(y[2]);

        x[0] = new int[3];
        x[1] = new int[1];
        x[2] = new int[2];

        int[][][] z = new int[2][][];
        z[0] = new int[3][];
        z[1] = new int[3][];

        z[0][0] = new int[3];
        z[0][1] = new int[1];
        z[0][2] = new int[2];

        z[1][0] = new int[3];
        z[1][1] = new int[1];
        z[1][2] = new int[2];

        z[0][0][0] = 1;
    }
}
