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
    public ListNode rotateRight(ListNode head, int k) {
        if(head==null || k==0){
            return head;
        }
        Stack<ListNode> n=new Stack<>();
        ListNode temp=head;
        int size=1;
        while(temp.next!=null){
            n.push(temp);
            temp=temp.next;
            size=size+1;
        }
        int c=0;
        k=k%size;
        while(c<k && n.size()>0){
            ListNode curr=n.pop();
            curr.next.next=head;
            head=curr.next;
            curr.next=null;
            c++;
        }return head;
    }
}