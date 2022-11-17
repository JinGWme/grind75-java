/*
 * @lc app=leetcode.cn id=125 lang=java
 *
 * [125] 验证回文串
 */

// @lc code=start
class Solution {
    public boolean isPalindrome(String s) {
        int left = nextValidIndexLeft(s, -1); 
        int right = nextValidIndexRight(s, s.length());

        while (left < right && Character.toLowerCase(s.charAt(left)) == Character.toLowerCase(s.charAt(right))) {
            left = nextValidIndexLeft(s, left);
            right = nextValidIndexRight(s, right);
        }
        if (left < right) return false;
        return true;

    }
    private int nextValidIndexLeft(String s, int left) {
        do {
            left++;
        } while (left < s.length() && !Character.isLetterOrDigit(s.charAt(left)));
        return left;
    }
    
    private int nextValidIndexRight(String s, int right) {
        do {
            right--;
        } while (right >= 0 && !Character.isLetterOrDigit(s.charAt(right)));
        return right;
    }
}
// @lc code=end

