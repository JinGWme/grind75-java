/*
 * @lc app=leetcode.cn id=53 lang=java
 *
 * [53] 最大子数组和
 */

// @lc code=start
class Solution {
    public int maxSubArray(int[] nums) {
        int maxSum = Integer.MIN_VALUE, preSum = Integer.MIN_VALUE;
        for (int n : nums) {
            if (preSum > 0) preSum += n;
            else preSum = n;
            maxSum = Math.max(preSum, maxSum);
        }
        return maxSum;
    }
}
// @lc code=end

