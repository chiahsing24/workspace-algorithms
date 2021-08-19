/**
 * Question: How to find the sum of digits of a positive integer number using recursion?
 */

public class Main {
    public static void main(String[] args) {
        Main main = new Main();
        System.out.println("When input is 3456, the result of sumOfDigits is " + main.sumOfDigits(3456));
    }

    public int sumOfDigits(int n) {
        if (n < 0 || n == 0) {
            return 0;
        }

        return (n % 10) + sumOfDigits(n / 10);
    }
}