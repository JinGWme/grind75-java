/*
 * @lc app=leetcode.cn id=973 lang=java
 *
 * [973] 最接近原点的 K 个点
 */

// @lc code=start
class Solution {

    class PQElement {
        int distSq;
        int[] point;
        public PQElement(int distSq, int[] point) {
            this.distSq = distSq;
            this.point = point;
        }
    }
    public int[][] kClosest(int[][] points, int k) {
        if (k >= points.length) return points;
        
        PriorityQueue<PQElement> nearestPoints = new PriorityQueue<>((x, y) -> y.distSq - x.distSq);

        for (int[] p : points) {
            int distSq =  p[0]*p[0] + p[1] * p[1];
            nearestPoints.add(new PQElement(distSq, p));
            if (nearestPoints.size() > k) nearestPoints.poll();
        }
        
        int[][] result = new int[k][];
        for (int i = 0; i < k; i++) {
            PQElement pqe = nearestPoints.poll();
            result[i] = pqe.point;
        }
        return result;

    }
}
// @lc code=end

