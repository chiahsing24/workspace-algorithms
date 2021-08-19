/**
 * How to calculate the power of a number using recursion?
*/
public class Main {
    public static void main(String[] args) {
        int base = 2;
        int exp = -4;
        Main main = new Main();
        System.out.println("The value of " + base + " to the power of " + exp + " is " + main.powerOfNumber(base, exp));
    }

    public int powerOfNumber(int base, int exp) {
        if (exp == 0 ) {
            return 1;
        } else if (exp > 0) {
            return base * powerOfNumber(base, exp - 1);
        } else {
            return -1;
        }
    }
}
