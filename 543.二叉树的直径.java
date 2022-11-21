/*
 * @lc app=leetcode.cn id=543 lang=java
 *
 * [543] 二叉树的直径
 */

// @lc code=start
/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode() {}
 *     TreeNode(int val) { this.val = val; }
 *     TreeNode(int val, TreeNode left, TreeNode right) {
 *         this.val = val;
 *         this.left = left;
 *         this.right = right;
 *     }
 * }
 */
class Solution {
    class DepthInfo {
        int depth;
        int diameter; // local diameter
        public DepthInfo(int depth, int diameter) {
            this.depth = depth;
            this.diameter = diameter;
        }
    }
    public int diameterOfBinaryTree(TreeNode root) {
        return diameterRecur(root).diameter;
    }

    private DepthInfo diameterRecur(TreeNode root) {
        if (root == null) return new DepthInfo(-1, 0);

        DepthInfo left = diameterRecur(root.left);
        DepthInfo right = diameterRecur(root.right);

        int diameter = Math.max(left.diameter, right.diameter);
        diameter = Math.max(diameter, left.depth + right.depth + 2);
        int depth = Math.max(left.depth, right.depth)+1;
        return new DepthInfo(depth, diameter);

    }
}
// @lc code=end

