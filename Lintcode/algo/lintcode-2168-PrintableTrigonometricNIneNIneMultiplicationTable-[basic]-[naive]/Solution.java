public class Solution {
    public static void main(String[] args) {
        // write your code here
        for (int i = 1; i <= 9; i++) {
            String str = "";
            for (int j = 1; j <= i; j++) {
                str += (j + "*" + i + "=" + (i * j)) + " ";
            }
            System.out.println(str);
        }
    }
}