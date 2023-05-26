// https://leetcode.com/problems/split-linked-list-in-parts/description/

import java.util.ArrayList;

public class splitLLinparts {
    public ListNode[] splitListToParts(ListNode head, int k) {
        ArrayList<ListNode> arr = new ArrayList<>();
        while (head != null) {
            ListNode node = new ListNode(head.val);
            arr.add(node);
            head = head.next;
        }
        ListNode[] ans = new ListNode[k];
        int non = arr.size() / k;
        int rem = arr.size() % k;
        int p = 0;
        for (int i = 0; i < k && p < arr.size(); i++) {
            if (non == 0) {
                if (i >= rem)
                    continue;
                else {
                    ans[i] = arr.get(p);
                    p++;
                }
            } else {
                ListNode hd = arr.get(p);
                ListNode tail = hd;
                p++;
                int nd = 1;
                while (nd < non) {
                    ListNode node = arr.get(p);
                    tail.next = node;
                    tail = tail.next;
                    p++;
                    nd++;
                }
                if (i < rem) {
                    tail.next = arr.get(p);
                    p++;
                }
                ans[i] = hd;
            }
        }

        return ans;
    }
}