// https://leetcode.com/problems/maximum-twin-sum-of-a-linked-list/

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

public class maxTwinSum {
    public int pairSum(ListNode head) {
        if (head.next.next == null)
            return head.val + head.next.val;
        ListNode slow = head, fast = head.next;
        while (fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;
        }

        ListNode curr = slow.next, prev = null;
        slow.next = fast;
        while (prev != fast) {
            ListNode temp = curr.next;
            curr.next = prev;
            prev = curr;
            curr = temp;
        }

        int ans = Integer.MIN_VALUE;
        while (fast != null) {
            ans = Math.max(ans, head.val + fast.val);
            head = head.next;
            fast = fast.next;
        }

        return ans;
    }
}
