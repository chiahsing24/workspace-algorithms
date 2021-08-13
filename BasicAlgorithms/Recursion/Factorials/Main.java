public class Main {
    public static void main(String[] args) {
        Main fact = new Main();
        System.out.println("Ans: " + fact.factorial(3));
    }

    public int factorial(int n) {
        if (n < 0) {
            return -1;
        } 

        if (n == 0 || n == 1) {
            return 1;
        }

        return n * factorial(n - 1);
    }
}