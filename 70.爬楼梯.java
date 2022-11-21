/*
 * @lc app=leetcode.cn id=70 lang=java
 *
 * [70] 爬楼梯
 */

// @lc code=start
class Solution {
    public int climbStairs(int n) {
        int p1 = 1, p2 = 0;
        int steps = 0;
        while (n-- > 0) {
            steps = p1 + p2;
            p2 = p1;
            p1 = steps;
        }
        return steps;
    }
}
// @lc code=end

