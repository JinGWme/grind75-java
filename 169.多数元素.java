/*
 * @lc app=leetcode.cn id=169 lang=java
 *
 * [169] 多数元素
 */

// @lc code=start
class Solution {
    public int majorityElement(int[] nums) {
        // Arrays.sort(nums);
        // return nums[nums.length/2];
        int count = 0;
        int candidate = 0;
        for (int n : nums) {
            if (count == 0)
                candidate = n;
            if (n == candidate) count++;
            else count--;
        }
        return candidate;
    }
}
// @lc code=end

