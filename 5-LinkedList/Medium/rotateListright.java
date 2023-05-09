// https://leetcode.com/problems/rotate-list/

public class rotateListright {
    public ListNode rotateRight(ListNode head, int k) {
        if (head == null || head.next == null)
            return head;
        int len = 1;
        ListNode tail = head;
        while (tail.next != null) {
            len++;
            tail = tail.next;
        }
        k = k % len;
        k = len - k;
        while (k-- > 0) {
            ListNode temp = new ListNode(head.val);
            head = head.next;
            tail.next = temp;
            tail = tail.next;
        }

        return head;
    }
}
