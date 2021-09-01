public class Main {
    public static void main(String[] args) {
        Main main = new Main();
        int n = 10;
        System.out.println("The binary form of " + n + " is: " + main.decimalToBinary(n));

    }

    public int decimalToBinary(int n) {
        if (n == 0) {
            return 0;
        }

        return (n % 2) + 10 * decimalToBinary(n / 2);
    }
}
