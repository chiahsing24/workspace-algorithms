public class Main {
    public static void main(String[] args) {
        Main fib = new Main();
        System.out.println("Ans: " + fib.fibonacci(5));
    }

    public int fibonacci(int n) {
        if (n < 0) {
            return -1;
        }

        if (n == 0 || n == 1) {
            return n;
        }

        return fibonacci(n - 2) + fibonacci(n - 1);
    }
}
