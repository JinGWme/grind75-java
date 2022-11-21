/*
 * @lc app=leetcode.cn id=844 lang=java
 *
 * [844] 比较含退格的字符串
 */

// @lc code=start
class Solution {
    public boolean backspaceCompare(String s, String t) {
        int left = s.length() - 1;
        int right = t.length() - 1;
        while (left >= 0 && right >= 0) {
            left = nextValidIndex(s, left);
            right = nextValidIndex(t, right);
            if (left < 0 || right < 0) break;
            if (s.charAt(left--) != t.charAt(right--)) return false;
        }
        if (left >= 0) left = nextValidIndex(s, left);
        else right = nextValidIndex(t, right);
        if (left == -1 &&  right == -1) return true;
        return false;

    }
    
    private int nextValidIndex(String s, int index) {
        for (int cnt = 0; index >= 0; index--) {
            if (s.charAt(index) == '#') {
                cnt++;
            } else if (cnt > 0){
                cnt--;
            } else {
                return index;
            }
        }
        return index;
    }
}
// @lc code=end

