class Solution {
    public static int[][] directions = {{1, 0}, {-1, 0}, {0, -1}, {0, 1}};
    
    public int numIslands(char[][] grid) {
        int cnt = 0;
        int m = grid.length, n = grid[0].length;
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                if (grid[i][j] == '1') {
                    markIsland(grid, m, n, i, j);                    
                    cnt++;
                }
            }
        }
        return cnt;
    }
    
    public void markIsland(char[][] graph, int m, int n, int x, int y) {
        if (x < 0 || x >= m || y < 0 || y >= n || graph[x][y] == '0') return;
        graph[x][y] = '0';
        markIsland(graph, m, n, x + directions[0][0], y + directions[0][1]);
        markIsland(graph, m, n, x + directions[1][0], y + directions[1][1]);
        markIsland(graph, m, n, x + directions[2][0], y + directions[2][1]);
        markIsland(graph, m, n, x + directions[3][0], y + directions[3][1]);
    }
}