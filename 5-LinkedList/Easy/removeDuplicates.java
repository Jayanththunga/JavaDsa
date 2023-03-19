// https://leetcode.com/problems/remove-duplicates-from-sorted-list/description/
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

public class removeDuplicates {
    public ListNode deleteDuplicates(ListNode head) {
        if (head == null)
            return null;

        ListNode temp = head;
        ListNode tnext = head.next;
        while (temp != null && tnext != null) {
            if (temp.val == tnext.val)
                temp.next = tnext.next;
            else
                temp = temp.next;

            tnext = tnext.next;
        }
        return head;
    }
}
