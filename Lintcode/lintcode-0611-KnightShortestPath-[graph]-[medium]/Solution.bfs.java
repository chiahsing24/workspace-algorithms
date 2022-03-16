/**
 * Definition for a point.
 * class Point {
 *     int x;
 *     int y;
 *     Point() { x = 0; y = 0; }
 *     Point(int a, int b) { x = a; y = b; }
 * }
 */

public class Solution {
    /**
     * @param grid a chessboard included 0 (false) and 1 (true)
     * @param source, destination a point
     * @return the shortest path 
     */
    public int[] dirX = new int[]{1, 1, -1, -1, 2, 2, -2, -2};
    public int[] dirY = new int[]{2, -2, 2, -2, 1, -1, 1, -1};

    public int shortestPath(boolean[][] grid, Point source, Point destination) {
        // Write your code here
        if(grid == null || grid.length == 0 || grid[0].length == 0 || source == null || destination == null){
            return -1;
        }

        int steps = -1;
        Queue<Point> queue = new LinkedList<Point>();
        queue.offer(source);
        while(!queue.isEmpty()){
            steps++;
            int size = queue.size();
            for(int i = 0; i < size; i++){
                Point current = queue.poll();
                if(isDestination(current, destination)){
                    return steps;
                }
                for(int direction = 0; direction < 8; direction++){
                    Point nextStep = new Point(current.x + dirX[direction], current.y + dirY[direction]);
                    if(isAvailableStep(grid, nextStep)){
                        queue.offer(nextStep);
                        grid[nextStep.x][nextStep.y] = true;
                    }
                }
            }
        }
        return -1;
    }

    private boolean isAvailableStep(boolean[][] grid, Point p){
        int n = grid.length;
        int m = grid[0].length;
        return (p.x >= 0 && p.x < n && p.y >= 0 && p.y < m && grid[p.x][p.y] == false);
    }

    private boolean isDestination(Point p, Point dest){
        return (p.x == dest.x && p.y == dest.y);
    }
}