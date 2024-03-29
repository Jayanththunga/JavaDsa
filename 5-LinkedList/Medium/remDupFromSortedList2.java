// https://leetcode.com/problems/remove-duplicates-from-sorted-list-ii/

public class remDupFromSortedList2 {
    public ListNode deleteDuplicates(ListNode head) {
        ListNode sent = new ListNode(0, head);
        ListNode prev = sent;

        while(head!=null){
            if(head.next!=null && head.val==head.next.val){
                while(head.next!=null && head.val==head.next.val) head=head.next;
                prev.next=head.next;
            }else{
                prev=prev.next;
            }
            head=head.next;
        }

        return sent.next;

    }    
}
