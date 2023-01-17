class Solution {
    public int equalPairs(int[][] grid) {
        int cnt = 0;

        HashMap<String, Integer> rowMap = new HashMap<>();
        for (int i = 0; i < grid.length; i++) {
            StringBuilder sb = new StringBuilder();
            for (int j = 0; j < grid.length; j++) {
                sb = sb.append(grid[i][j]).append(",");

            }

            rowMap.put(sb.toString(), rowMap.getOrDefault(sb.toString(), 0) + 1);
        }

        HashMap<String, Integer> colMap = new HashMap<>();
        for (int i = 0; i < grid.length; i++) {
            StringBuilder sb = new StringBuilder();
            for (int j = 0; j < grid.length; j++) {
                sb = sb.append(grid[j][i]).append(",");
            }

            colMap.put(sb.toString(), colMap.getOrDefault(sb.toString(), 0) + 1);
        }

        for (String rowMapKey : rowMap.keySet()) {
            if (rowMap.containsKey(rowMapKey) && colMap.containsKey(rowMapKey)) {
                cnt += rowMap.get(rowMapKey) * colMap.get(rowMapKey);
            }
        }

        return cnt;
    }
}


/**

    rowMap: {
        "3122": 1,
        "1445": 1,
        "2422": 2
    }

    colMap: {
        "3122": 1,
        "1444": 1,
        "2422": 1,
        "2522": 1
    }
 */


 /**
    13, 13,
    13, 13

    rowMap: {
        "1313": 2,
    }

    colMap: {
        "1313": 2
    }
  */

   /**
    !!Important edge case!!

    11, 1,
    1, 11

    wrong way
    rowMap: {
        "111": 2,
    }

    colMap: {
        "111": 2
    }

    modified way
    rowMap: {
        "11,1": 1,
        "1,11": 1
    }

    colMap: {
        "11,1": 1,
        "1,11": 1
    }
  */