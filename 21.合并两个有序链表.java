/*
 * @lc app=leetcode.cn id=21 lang=java
 *
 * [21] 合并两个有序链表
 */

// @lc code=start
/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */
class Solution {
    public ListNode mergeTwoLists(ListNode list1, ListNode list2) {
        if (list1 == null || list2 == null) return list1 == null ? list2 : list1;
        ListNode head = null, curr = null, prev = null;

        while (list1 != null && list2 != null) {
            if (list1.val <= list2.val) {
                curr = list1;
                list1 = list1.next;
            } else {
                curr = list2;
                list2 = list2.next;
            }
            if (head == null) head = curr;
            else prev.next = curr;
            prev = curr;
        }
        if (list1 != null) curr.next = list1;
        else curr.next = list2;

        return head;
    }
}
// @lc code=end

