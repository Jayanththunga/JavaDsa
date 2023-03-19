import java.util.ArrayList;

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

public class reverseLinkedList {
    public ListNode reverseList(ListNode head) {
        if (head == null)
            return null;
        ArrayList<Integer> arr = new ArrayList<>();
        while (head != null) {
            arr.add(head.val);
            head = head.next;
        }

        int t = arr.size() - 1;
        ListNode hed = new ListNode(arr.get(t));
        ListNode tail = hed;
        t--;
        while (t >= 0) {
            ListNode node = new ListNode(arr.get(t));
            tail.next = node;
            tail = tail.next;
            t--;
        }

        return hed;
    }
}
