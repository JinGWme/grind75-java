/*
 * @lc app=leetcode.cn id=217 lang=java
 *
 * [217] 存在重复元素
 */

// @lc code=start
class Solution {
    public boolean containsDuplicate(int[] nums) {
        Set<Integer> uniqs = new HashSet<>();
        for (int n : nums) {
            if (uniqs.contains(n)) return true;
            else uniqs.add(n);
        }
        return false;
    }
}
// @lc code=end

