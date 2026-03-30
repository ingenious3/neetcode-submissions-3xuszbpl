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
    public ListNode mergeKLists(ListNode[] lists) {
        if (lists == null || lists.length == 0) {
            return null;
        }

        PriorityQueue<ListNode> pq = new PriorityQueue<ListNode>(Comparator.comparing(e -> e.val));

        for (ListNode node: lists) {
            if (node != null) {
                pq.offer(node);
            }
        }

        ListNode head = new ListNode(0);
        ListNode p = head;

        while(!pq.isEmpty()) {
            ListNode t = pq.poll();
            p.next = t;
            p = p.next;
            if (t.next != null) {
                pq.offer(t.next);
            }
        }

        return head.next;

    }
}
