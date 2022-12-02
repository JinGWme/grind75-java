/*
 * @lc app=leetcode.cn id=3 lang=java
 *
 * [3] 无重复字符的最长子串
 */

// @lc code=start
class Solution {
    public int lengthOfLongestSubstring(String s) {
        
        Set<Character> uniqChars = new HashSet<>();
        int maxLen = 0;

        for (int left = 0, right = 0; right < s.length(); right++) {
            char add = s.charAt(right);
            while(uniqChars.contains(add)) uniqChars.remove(s.charAt(left++));
            uniqChars.add(add);
            maxLen = Math.max(uniqChars.size(), maxLen);
        }
        
        return maxLen;
    }
}
// @lc code=end

