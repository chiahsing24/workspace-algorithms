public class Solution {
    /**
     * @param n: the number of disks
     * @return: the order of moves
     */
    public List<String> towerOfHanoi(int n) {
        // write your code here
        List<String> moves = new ArrayList<>();
        moveDisks(n, 'A', 'C', 'B', moves);
        return moves;
    }

    public void moveDisks(int n, char start, char end, char assist, List<String> moves) {
        if (n == 1) {
            moves.add(move(start, end));
            return;
        }

        moveDisks(n - 1, start, assist, end, moves);
        moves.add(move(start, end));
        moveDisks(n - 1, assist, end, start, moves);
    }

    public String move(char start, char end) {
        return "from " + start + " to " + end;
    }
}