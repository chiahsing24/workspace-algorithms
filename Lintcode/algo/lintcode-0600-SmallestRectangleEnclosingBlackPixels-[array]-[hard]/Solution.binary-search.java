public class Solution {
    /**
     * @param image: a binary matrix with '0' and '1'
     * @param x: the location of one of the black pixels
     * @param y: the location of one of the black pixels
     * @return: an integer
     */
    public int minArea(char[][] image, int x, int y) {
        // write your code here
        if (image == null || image.length == 0 || image[0].length == 0) {
            return 0;
        }

        int N = image.length;
        int M = image[0].length;
        
        int start = 0;
        int end = y;
        while (start + 1 < end) {
            int mid = start + (end - start) / 2;
            if (checkColumn(image, mid)) {
                end = mid;
            } else {
                start = mid;
            }
        }
        
        int left = 0;
        if (checkColumn(image, start)) {
            left = start;
        } else if (checkColumn(image, end)) {
            left = end;
        } else {
            return 0;
        }
        
        start = y;
        end = M - 1;
        while (start + 1 < end) {
            int mid = start + (end - start) / 2;
            if (checkColumn(image, mid)) {
                start = mid;
            } else {
                end = mid;
            }
        }
        
        int right = y;
        if (checkColumn(image, end)) {
            right = end;
        } else if (checkColumn(image, start)) {
            right = start;
        }
        
        start = 0;
        end = x;
        while (start + 1 < end) {
            int mid = start + (end - start) / 2;
            if (checkRow(image, mid)) {
                end = mid;
            } else {
                start = mid;
            }
        }
        
        int top = 0;
        if (checkRow(image, start)) {
            top = start;
        } else if (checkRow(image, end)) {
            top = end;
        }
        
        start = x;
        end = N - 1;
        while (start + 1 < end) {
            int mid = start + (end - start) / 2;
            if (checkRow(image, mid)) {
                start = mid;
            } else {
                end = mid;
            }
        }
        
        int bottom = x;
        if (checkRow(image, end)) {
            bottom = end;
        } else if (checkRow(image, start)) {
            bottom = start;
        }
        
        return (right - left + 1) * (bottom - top + 1);
    }
    
    private boolean checkColumn(char[][] image, int col) {
        for (int i = 0; i < image.length; i++) {
            if (image[i][col] == '1') {
                return true;
            }
        }
        return false;
    }
    
    private boolean checkRow(char[][] image, int row) {
        for (int j = 0; j < image[0].length; j++) {
            if (image[row][j] == '1') {
                return true;
            }
        }
        return false;
    }
}