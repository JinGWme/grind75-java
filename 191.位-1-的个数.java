/*
 * @lc app=leetcode.cn id=191 lang=java
 *
 * [191] 位1的个数
 */

// @lc code=start
public class Solution {
    public int hammingWeight(int n) {
        int result = 0;
        while (n != 0) {
            n &= n-1;
            result++;
        }
        return result;
    }
    // private static int[] bitCache = new int[256];
    // // you need to treat n as an unsigned value
    // public int hammingWeight(int n) {
    //     byte[] c4 = new byte[4];
    //     for (int i = 0; i < 4; i++) {
    //         c4[i] = (byte)n;
    //         n >>= 8;
    //     }
    //     int sum = 0;
    //     for (int i = 0; i < 4; i++) {
    //         sum += byteBitCount(c4[i]);
    //     }
    //     return sum;
    // }

    // private int byteBitCount(byte c) {
    //     int index = c & 0xff;
    //     if (index == 0) return 0;
    //     if (bitCache[index] != 0) return bitCache[index];
    //     int bitCount = 0;
    //     if (index % 2 == 1 && bitCache[index-1] != 0) bitCount = bitCache[index-1]+1;
    //     else {
    //         for (int a = index; a > 0; a /= 2) {
    //             if ( a % 2 == 1) bitCount++;
    //         }
    //     }
    //     for (int i = index; i < 256; i *= 2) {
    //         bitCache[i] = bitCount;
    //     }
    //     return bitCache[index];
    // }
}
// @lc code=end

