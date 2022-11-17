/*
 * @lc app=leetcode.cn id=704 lang=java
 *
 * [704] 二分查找
 */

// @lc code=start
class Solution {
    public int search(int[] nums, int target) {
        return searchRecur(nums, target, 0, nums.length);
    }
    
    private int searchRecur(int[] nums, int target, int low, int high) {
        if (low >= high) return -1;
        int mid = low + (high-low)/2;
        if (nums[mid] > target) {
            return searchRecur(nums, target, low, mid);
        } else if (nums[mid] < target) {
            return searchRecur(nums, target, mid+1, high);
        } else {
            return mid;
        }
    }
}
// @lc code=end

