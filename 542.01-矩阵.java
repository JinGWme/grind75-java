/*
 * @lc app=leetcode.cn id=542 lang=java
 *
 * [542] 01 矩阵
 */

// @lc code=start
class Solution {
    public int[][] updateMatrix(int[][] mat) {
        return updateMatrixDP(mat);
    }
    private int[][] updateMatrixDP(int[][] mat) {
        int m = mat.length, n = mat[0].length;

        int[][] result = new int[m][n];
        for (int[] arr : result) Arrays.fill(arr, Integer.MAX_VALUE/2);
        
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                if (mat[i][j] == 0) result[i][j] = 0;
            }
        }
        
        // top left
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                if (i - 1 >= 0) result[i][j] = Math.min(result[i][j], result[i-1][j] + 1);
                if (j - 1 >= 0) result[i][j] = Math.min(result[i][j], result[i][j-1] + 1);
            }
        }
        //bottom right
        for (int i = m-1; i >= 0; i--) {
            for (int j = n-1; j >= 0; j--) {
                if (i + 1 < m) result[i][j] = Math.min(result[i][j], result[i+1][j] + 1);
                if (j + 1 < n) result[i][j] = Math.min(result[i][j], result[i][j+1] + 1);
            }
        }

        return result;
        
    }
    private int[][] updateMatrixBFS(int[][] mat) {
        int m = mat.length;
        int n = mat[0].length;
        
        int[][] result = new int[m][n];
        for (int i = 0; i < m; i++) {
            Arrays.fill(result[i], Integer.MAX_VALUE);
        }
        
        // find all 0 to fill bfs queue
        Queue<int[]> bfsQueue = new ArrayDeque<>();
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                if (mat[i][j] == 0) {
                    result[i][j] = 0;
                    bfsQueue.add(new int[]{i, j});
                }
            }
        }
        
        while (!bfsQueue.isEmpty()) {
            int[] loc = bfsQueue.remove();
            int row = loc[0], col = loc[1];
            int distance = result[row][col]+1;
            setDistance(row-1, col, distance, result, bfsQueue);
            setDistance(row+1, col, distance, result, bfsQueue);
            setDistance(row, col-1, distance, result, bfsQueue);
            setDistance(row, col+1, distance, result, bfsQueue);
        }
        return result;

    }
    private void setDistance(int row, int col, int distance, int[][] distances, Queue<int[]> bfsQueue) {
        if (row < 0 || row >= distances.length) return;
        if (col < 0 || col >= distances[0].length) return;
        if (distances[row][col] == Integer.MAX_VALUE) {
            distances[row][col] = distance;
            bfsQueue.add(new int[]{row, col});
        }
    }
}
// @lc code=end

