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
        if(head!=null && head.next!=null && head.next.next!=null)
        {
        ListNode first=head;
        ListNode second=head.next.next;
        while( first!=null && second!=null && second.next!=null)
        {
            first=first.next;
            second=second.next.next;
            if(first==second)
            {
                return true;
            }
        }
        }
        return false;
    }
}