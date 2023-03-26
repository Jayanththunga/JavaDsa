import java.util.ArrayList;

// https://leetcode.com/problems/reorder-list/

public class reorderList {
    // using ArrayList:
    public void reorderList1(ListNode head) {
        ArrayList<Integer> arr = new ArrayList<>();
        ListNode temp = head;
        while (temp != null) {
            arr.add(temp.val);
            temp = temp.next;
        }

        int i = 0;
        int j = arr.size() - 1;
        temp = head;
        while (temp != null && temp.next != null) {
            temp.val = arr.get(i);
            temp = temp.next;
            i++;
            temp.val = arr.get(j);
            temp = temp.next;
            j--;
        }

        if (i == j)
            temp.val = arr.get(i);
    }

    // without using ArrayList:

    public void reorderList2(ListNode head) {
        // finding midpoint:
        ListNode slow = head, fast = head;
        while (fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;
        }

        // reversing part 2:
        ListNode prev = null, curr = slow.next;
        slow.next = null;
        while (curr != null) {
            ListNode temp = curr.next;
            curr.next = prev;
            prev = curr;
            curr = temp;
        }

        // merging both:
        ListNode curr1 = head, curr2 = prev;
        while (curr1 != null && curr2 != null) {
            ListNode next1 = curr1.next;
            ListNode next2 = curr2.next;

            curr1.next = curr2;
            curr2.next = next1;
            curr1 = next1;
            curr2 = next2;
        }
    }

}
