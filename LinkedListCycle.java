/**
 * Definition for singly-linked list.
 * class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) {
 *         val = x;
 *         next = null;
 *     }
 * }
 */
public class Solution {
    public boolean hasCycle(ListNode head) {
        if(head == null || head.next == null) return false;
        ListNode p1 = head;
        ListNode p2 = head;
        while(p2 != null && p2.next != null && p2.next.next != null){
            p1 = p1.next;
            p2 = p2.next.next;
            if(p2 == p1 || p2.next == p1) return true;
        }
        return false;
    }
}
