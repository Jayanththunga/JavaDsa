//https://leetcode.com/problems/remove-nth-node-from-end-of-list/description/

public class removeNthNodeformEnd {
    public ListNode removeNthFromEnd(ListNode head, int n) {
        int len = 0;
        ListNode nd = head;
        while (nd != null) {
            len++;
            nd = nd.next;
        }
        nd = head;
        int rm = len - n - 1, p = 0;
        if (n == len) {
            head = head.next;
            return head;
        }
        while (p < rm) {
            nd = nd.next;
            p++;
        }

        nd.next = nd.next.next;
        return head;
    }
}
