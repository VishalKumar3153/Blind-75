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
    public ListNode removeNthFromEnd(ListNode head, int n) {
        ListNode t=head;
        int c=0;
        while(t!=null)
        {
            c++;
            t=t.next;
        }
        if(c==1)
        {
            head=null;
        }
        else if(c==2 && n==1)
        {
            head.next=null;
        }
        else if(c==n)
        {
            head=head.next;
        }
        else{
        t=head;
        int x=c-n;
        c=1;
        while(c<x)
        {
           
            t=t.next;
             c++;
        }
        t.next=t.next.next;
        }
        return head;
    }
}