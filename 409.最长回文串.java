/*
 * @lc app=leetcode.cn id=409 lang=java
 *
 * [409] 最长回文串
 */

// @lc code=start
class Solution {
    public int longestPalindrome(String s) {
        int[] lowerCount = new int[26];
        int[] upperCount = new int[26];

        for (char c : s.toCharArray()) {
            if (Character.isLowerCase(c)) lowerCount[c-'a']++;
            else upperCount[c-'A']++;
        }
        int length = 0;
        boolean oddExists = false;
        for (int i = 0; i < 26; i++) {
            if (lowerCount[i] % 2 == 0) length += lowerCount[i];
            else {
                length += lowerCount[i]-1;
                oddExists = true;
            }
            
            if (upperCount[i] % 2 == 0) length += upperCount[i];
            else {
                length += upperCount[i]-1;
                oddExists = true;
            }
        }
        return oddExists ? length+1 : length;
    }
}
// @lc code=end

