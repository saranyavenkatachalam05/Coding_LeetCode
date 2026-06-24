class Solution {
    public ListNode mergeTwoLists(ListNode l1, ListNode l2) {
        ListNode n = new ListNode(0);
        ListNode ptr = n;

        // Fix 1: use AND instead of OR
        while (l1 != null && l2 != null) {

            // Fix 2: use l1.val and l2.val
            if (l1.val == l2.val) {
                ptr.next = new ListNode(l1.val);
                ptr = ptr.next;

                ptr.next = new ListNode(l2.val);
                ptr = ptr.next;

                l1 = l1.next;
                l2 = l2.next;

            } else if (l1.val < l2.val) {
                ptr.next = new ListNode(l1.val);
                ptr = ptr.next;
                l1 = l1.next;

            } else {
                ptr.next = new ListNode(l2.val);
                ptr = ptr.next;
                l2 = l2.next;
            }
        }

        // Fix 3: attach remaining nodes
        while (l1 != null) {
            ptr.next = new ListNode(l1.val);
            ptr = ptr.next;
            l1 = l1.next;
        }

        while (l2 != null) {
            ptr.next = new ListNode(l2.val);
            ptr = ptr.next;
            l2 = l2.next;
        }

        return n.next;
    }
}