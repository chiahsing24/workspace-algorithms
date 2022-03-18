class Solution {
    public List<List<String>> solveNQueens(int n) {
        List<List<String>> result = new ArrayList<>();
        List<StringBuilder> board = new ArrayList<>();
        
        StringBuilder sb = new StringBuilder(); 
        for (int i = 0; i < n; i++) {
                sb.append(".");
        }
        
        for (int i = 0; i < n; i++) {
            board.add(new StringBuilder(sb)); // 重要: 記得一定要深拷貝, 一開始因為沒有深拷貝debug很久
        }
        
        find(board, result, 0, n);
        
        return result;
    }
    
    public void find(List<StringBuilder> board, List<List<String>> result, int numQueens, int n) {
        if (numQueens == n) {
            List<String> ans = new ArrayList<>();
            for (int i = 0; i < n; i++) {
                ans.add(board.get(i).toString());
            }
            result.add(ans);
            return;
        }
        
        for (int col = 0; col < n; col++) {
            if (!isSafeLocation(board, numQueens, col)) {
                continue;
            }
            
            board.get(numQueens).setCharAt(col, 'Q');
            find(board, result, numQueens + 1, n); 
            board.get(numQueens).setCharAt(col, '.'); // backtracking時, 記得該要還原的應該是哪一層的
            
        }
        
    }
    
    public boolean isSafeLocation(List<StringBuilder> board, int nextRow, int nextColumn) {
        for (int row = 0; row < board.size(); row++) {
            for (int col = 0; col < board.get(row).length(); col++) {
                if (board.get(row).charAt(col) == 'Q') {
                    if (row == nextRow || col == nextColumn || col - row == nextColumn - nextRow || row + col == nextRow + nextColumn) {
                        return false;
                    }
                }
            }
        }
        return true;
    }
}