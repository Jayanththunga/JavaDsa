// https://leetcode.com/problems/partition-list/

public class partitionlist {
    public ListNode partition(ListNode head, int x) {
        if(head==null || head.next==null) return head;
        ListNode left = null, lefttail = left;
        ListNode right = null, righttail = right;

        while(head!=null){
            if(head.val<x){
                if(left==null){
                    left = new ListNode(head.val);
                    lefttail = left;
                }
                else{
                    ListNode node = new ListNode(head.val);
                    lefttail.next = node;
                    lefttail = lefttail.next;
                }
            }else{
                if(right==null){
                    right = new ListNode(head.val);
                    righttail = right;
                }else{
                    righttail.next = new ListNode(head.val);
                    righttail = righttail.next;
                }
            }
            head=head.next;
        }

        if(left==null) return right;
        lefttail.next = right;
        return left;
    }
}
