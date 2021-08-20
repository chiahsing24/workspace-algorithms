public class Main {
    public static void main(String[] args) {
        Main main = new Main();
        int n1 = 1980, n2 = 1617;
        System.out.println("The greatest common divisor of " + n1 + ", " + n2 + " is: " + main.gcd(n1, n2));
    }

    public int gcd(int n1, int n2) {
        if (n1 < 0 || n2 < 0) {
            return -1;
        }

        if (n1 == 0) {
            return n2;
        }
        
        if (n2 == 0) {
            return n1;
        }

        if (n1 > n2) {
            return gcd(n1 % n2, n2);
        } else {
            return gcd(n1, n2 % n1);
        }
    }
}
