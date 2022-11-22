/*
 * @lc app=leetcode.cn id=338 lang=java
 *
 * [338] 比特位计数
 */

// @lc code=start
class Solution {
    public int[] countBits(int n) {
        int[] count = new int[n + 1];
        count[0] = 0;
        for (int i = 1; i <= n; i++) {
            if (count[i] != 0) continue;
            int bitCount = 0;
            if (i % 2 == 1) bitCount = count[i-1]+1;
            for (int j = i; j <= n; j *= 2) {
                count[j] = bitCount;
            }
        }
        return count;

    }
}
// @lc code=end

