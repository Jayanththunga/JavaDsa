import java.util.HashSet;

// https://leetcode.com/problems/intersection-of-two-linked-lists/description/

public class intersectionOfTwoLL {
    public ListNode getIntersectionNode(ListNode headA, ListNode headB) {
        HashSet<ListNode> one = new HashSet<>();
        ListNode temp = headA;
        while (temp != null) {
            one.add(temp);
            temp = temp.next;
        }
        temp = headB;
        while (temp != null) {
            if (one.contains(temp))
                return temp;
            temp = temp.next;
        }

        return null;
    }
}
