// https://leetcode.com/problems/middle-of-the-linked-list/description/

public class middleOfLL {
    public ListNode middleNode(ListNode head) {
        ListNode tail = head;
        int n = 0;
        while (tail != null) {
            n++;
            tail = tail.next;
        }

        int i = n / 2;
        while (i-- > 0) {
            head = head.next;
        }

        return head;
    }
}
