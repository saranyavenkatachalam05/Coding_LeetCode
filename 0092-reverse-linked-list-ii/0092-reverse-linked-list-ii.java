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
    public ListNode reverseBetween(ListNode head, int left, int right) {
        ListNode dummy=new ListNode(0);
        dummy.next=head;
        ListNode curr=head;
        ListNode prev=dummy;
        for(int i=0;i<left-1;i++){
            prev=prev.next;
            curr=curr.next;
        }
        ListNode sub=curr;
        ListNode prenode=null;
        for(int i=0;i<=right-left;i++){
            ListNode nextnode=curr.next;
            curr.next=prenode;
            prenode=curr;
            curr=nextnode;
        }
        prev.next=prenode;
        sub.next=curr;
        return dummy.next;
    }
}