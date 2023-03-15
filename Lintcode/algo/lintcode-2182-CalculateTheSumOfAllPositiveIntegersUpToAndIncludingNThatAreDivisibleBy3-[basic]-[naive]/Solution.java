public class Solution {
    public int add(int number) {
        int i = 3;
        int sum = 0;
        // write your code here
        while (i <= number) {
            if (i % 3 == 0) {
                sum += i;
            }
            i += 3;
        }
        
        return sum;
    }
}