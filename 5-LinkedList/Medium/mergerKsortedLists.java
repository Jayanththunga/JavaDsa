// https://leetcode.com/problems/merge-k-sorted-lists/

import java.util.PriorityQueue;

public class mergerKsortedLists {    
    public ListNode mergeKLists(ListNode[] lists) {
        PriorityQueue<Integer> pq = new PriorityQueue<>();
        for(int i=0;i<lists.length;i++){
            ListNode head = lists[i];
            while(head!=null){
                pq.add(head.val);
                head = head.next;
            }
        }

        if(pq.isEmpty()) return null;
        ListNode head = new ListNode(pq.poll());
        ListNode tail = head;
        while(!pq.isEmpty()){
            ListNode node = new ListNode(pq.poll());
            tail.next = node;
            tail = tail.next;
        }

        return head;
    }
}