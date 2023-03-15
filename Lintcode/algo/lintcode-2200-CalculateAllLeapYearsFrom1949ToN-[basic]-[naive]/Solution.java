public class Solution {
    public void leapYear(int year) {
        for (int i = 1949; i <= year; i++) {
            if (((i % 400) == 0) || (((i % 4) == 0) && ((i % 100) != 0))) {
                System.out.println(i);
            }
        }
    }
}