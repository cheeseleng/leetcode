package com.leng.leetcode.leetcode.code.leetcode.leetcode2;

/**
 * @author leng
 * @date 2017/12/18
 **/
public class Solution {


    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        ListNode result = new ListNode(-1);
        ListNode l3 = result;
        if (l1 == null || l2 == null) {
            return null;
        }
        boolean carry = false;
        while (l1 != null && l2 != null) {
            if (carry) {
                l1.val = l1.val + 1;
            }
            if (l1.val + l2.val > 9) {
                carry = true;
                l3.next = new ListNode((l1.val + l2.val) - 10);
            } else {
                carry = false;
                l3.next = new ListNode(l1.val + l2.val);
            }
            if (l1.next == null && l2.next != null) {
                l1 = new ListNode(0);
                l2 = l2.next;
            } else if (l2.next == null && l1.next != null) {
                l2 = new ListNode(0);
                l1 = l1.next;
            } else {
                l1 = l1.next;
                l2 = l2.next;
            }
            l3 = l3.next;
        }
        if (carry) {
            l3.next = new ListNode(1);
        }
        return result.next;
    }


    public static void main(String[] args) {
        Solution solution = new Solution();
        ListNode l1 = new ListNode(1);
        l1.next = new ListNode(8);
//        l1.next.next = new ListNode(3);

        ListNode l2 = new ListNode(0);
//        l2.next = new ListNode(6);
//        l2.next.next = new ListNode(4);
        solution.addTwoNumbers(l1, l2);
    }
}
