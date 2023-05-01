class Solution {
    public double myPow(double x, int n) {
        if (x == 0) {
            return 0;
        } 

        int absN = Math.abs(n);
        double value = calculate(x, absN);

        if (n >= 0) {
            return value;
        } else {
            return 1 / value;
        }
    }

    public double calculate(double x, int n) {
        if (n == 0) {
            return 1;
        }

        if (x == 0) {
            return 0;
        }

        double temp = calculate(x, n / 2);

        if (n % 2 == 0) {
            return temp * temp;
        } else {
            return temp * temp * x;
        }
    }
}
