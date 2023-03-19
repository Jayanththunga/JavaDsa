// https://leetcode.com/problems/middle-of-the-linked-list/description/
class ListNode {
    int val;
    ListNode next;

    ListNode() {
    }

    ListNode(int val) {
        this.val = val;
    }

    ListNode(int val, ListNode next) {
        this.val = val;
        this.next = next;
    }
}

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
