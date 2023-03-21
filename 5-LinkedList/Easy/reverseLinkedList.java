import java.util.ArrayList;

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
