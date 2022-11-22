/*
 * @lc app=leetcode.cn id=14 lang=java
 *
 * [14] 最长公共前缀
 */

// @lc code=start
class Solution {
    public String longestCommonPrefix(String[] strs) {
        int commLength = 0;
        outer:
        for (;; commLength++) {
            if (commLength >= strs[0].length()) break;
            char c = strs[0].charAt(commLength);
            for (String s : strs) {
                if (commLength >= s.length()) break outer;
                if (s.charAt(commLength) != c) break outer;
            }
        }

        return strs[0].substring(0, commLength);

    }
}
// @lc code=end

