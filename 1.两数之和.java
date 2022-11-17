/*
 * @lc app=leetcode.cn id=1 lang=java
 *
 * [1] 两数之和
 */

// @lc code=start
class Solution {
    public int[] twoSum(int[] nums, int target) {
        Map<Integer, Integer> number2Index = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            number2Index.put(nums[i], i);
        }

        for (int i = 0; i < nums.length; i++) {
            if (number2Index.containsKey(target - nums[i])) {
                int j = number2Index.get(target - nums[i]);
                if (i == j) continue; 
                return new int[]{i, j};
            }
        }

        return new int[2];

    }
}
// @lc code=end

