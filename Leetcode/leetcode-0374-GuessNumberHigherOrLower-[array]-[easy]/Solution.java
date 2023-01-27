/** 
 * Forward declaration of guess API.
 * @param  num   your guess
 * @return 	     -1 if num is higher than the picked number
 *			      1 if num is lower than the picked number
 *               otherwise return 0
 * int guess(int num);
 */

 public class Solution extends GuessGame {
    public int guessNumber(int n) {
        int left = 1, right = n;
        while (left + 1 < right) {
            int mid = left + (right - left) / 2;
            if (guess(mid) == 1) {
                left = mid;
            } else if (guess(mid) == -1) {
                right = mid;
            } else {
                return mid;
            }
        }

        if (guess(left) == 0) {
            return left;
        }

        return right;
    }
}