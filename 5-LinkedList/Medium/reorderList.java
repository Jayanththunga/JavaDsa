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
}
