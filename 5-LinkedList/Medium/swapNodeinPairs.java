// https://leetcode.com/problems/swap-nodes-in-pairs/description/

public class swapNodeinPairs {
    public ListNode swapPairs(ListNode head) {
        if (head == null || head.next == null)
            return head;
        ListNode newhead = head.next;
        head.next = newhead.next;
        newhead.next = head;
        
        ListNode now = null, prev = head;
        if (head.next != null)
            now = head.next;

        while (now != null) {
            if (now.next == null)
                break;
            ListNode next = now.next;

            now.next = next.next;
            prev.next = next;
            next.next = now;

            prev = now;
            now = now.next;
        }

        return newhead;

    }
}
