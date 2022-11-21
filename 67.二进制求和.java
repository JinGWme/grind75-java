/*
 * @lc app=leetcode.cn id=67 lang=java
 *
 * [67] 二进制求和
 */

// @lc code=start
class Solution {
    public String addBinary(String a, String b) {
        int[] result = new int[Math.max(a.length(), b.length())+1];
        for (int i = result.length-1, carry = 0, j = 0; i >= 0; i--, j++) {
            int ai = j >= a.length() ? 0 : a.charAt(a.length()-1-j)-'0';
            int bi = j >= b.length() ? 0 : b.charAt(b.length()-1-j)-'0';
            int r = ai + bi + carry;
            switch (r) {
            case 0:
                carry = 0;
                result[i] = 0;
                break;
            case 1:
                carry = 0;
                result[i] = 1;
                break;
            case 2:
                carry = 1;
                result[i] = 0;
                break;
            case 3:
                carry = 1;
                result[i] = 1;
                break;
            }
        }
        
        StringBuilder sb = new StringBuilder();
        if (result[0] != 0) sb.append('1');
        for (int i = 1; i < result.length; i++) {
            if (result[i] != 0) sb.append('1');
            else sb.append('0');
        }
        return sb.toString();
    }
}
// @lc code=end

