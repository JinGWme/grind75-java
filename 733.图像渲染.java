/*
 * @lc app=leetcode.cn id=733 lang=java
 *
 * [733] 图像渲染
 */

// @lc code=start
class Solution {
    public int[][] floodFill(int[][] image, int sr, int sc, int color) {
        if (image[sr][sc] == color) return image;
        floodFillRecur(image, sr, sc, image[sr][sc], color);
        return image;
    }
    private void floodFillRecur(int[][] image, int row, int col, int startingColor, int newColor) {
        if (row >= image.length || row < 0) return ;
        if (col >= image[0].length || col < 0) return ;
        if (startingColor != image[row][col]) return ;

        image[row][col] = newColor;
        floodFillRecur(image, row-1, col, startingColor, newColor);
        floodFillRecur(image, row+1, col, startingColor, newColor);
        floodFillRecur(image, row, col-1, startingColor, newColor);
        floodFillRecur(image, row, col+1, startingColor, newColor);
    }
}
// @lc code=end

