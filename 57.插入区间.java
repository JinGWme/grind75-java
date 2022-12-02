/*
 * @lc app=leetcode.cn id=57 lang=java
 *
 * [57] 插入区间
 */

// @lc code=start
class Solution {
    public int[][] insert(int[][] intervals, int[] newInterval) {
        int start = newInterval[0], end = newInterval[1];
        List<int[]> resultList = new ArrayList<>();
        boolean placed = false;

        for (int[] interval : intervals) {
            // System.out.println(interval[0] + " " + placed);
            if (!placed) {
                if (start > interval[1] || end < interval[0]) { // not overlapping
                    if (start < interval[0]) {  // add whatever comes first
                        resultList.add(new int[]{start, end});
                        placed = true;
                    }
                    resultList.add(interval);
                } else { //overlapping
                    start = Math.min(start, interval[0]);
                    end = Math.max(end, interval[1]);
                }
            } else {
                resultList.add(interval);
            }
            
        }
        if (!placed) resultList.add(new int[]{start, end});
        
        int[][] result = new int[resultList.size()][2];
        for (int i = 0; i < resultList.size(); i++) {
            result[i] = resultList.get(i);
        }
        return result;
    }
}
// @lc code=end

