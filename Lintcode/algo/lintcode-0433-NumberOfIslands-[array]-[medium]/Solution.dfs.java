public class Solution {
    /**
     * @param grid: a boolean 2D matrix
     * @return: an integer
     */

    public int[][] directions = {{-1, 0}, {1, 0}, {0, -1}, {0, 1}};

    public int numOfIslands = 0;

    public int numIslands(boolean[][] grid) {
        // write your code here
        for (int i = 0; i < grid.length; i++) {
            for (int j = 0; j < grid[i].length; j++) {
                if (grid[i][j] == true) {
                    numOfIslands++;
                    markVisited(grid, i, j);
                } 
            }
        }

        return numOfIslands;
    }

    public void markVisited(boolean[][] grid, int curX, int curY) {
        if (!isWithinValidRange(grid, curX, curY)) {
            return;
        }

        if (grid[curX][curY] == false) {
            return;
        }

        grid[curX][curY] = false;
        for (int i = 0; i < directions.length; i++) {
            int newX = curX + directions[i][0];
            int newY = curY + directions[i][1];
            markVisited(grid, newX, newY);
        }
    }

    public boolean isWithinValidRange(boolean[][] grid, int curX, int curY) {
        if (curX < 0 || curX >= grid.length || curY < 0 || curY >= grid[0].length) {
            return false;
        }
        return true;
    }
}