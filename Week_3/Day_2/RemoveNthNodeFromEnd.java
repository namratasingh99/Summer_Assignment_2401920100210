/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */
class Solution {
    public ListNode removeNthFromEnd(ListNode head, int n) {
        if(head.next==null && n==1) return  null;

        ListNode slow = head;
        ListNode fast = head;
        for(int i=0 ; i<n ; i++){
            fast= fast.next;
        }
        if(fast==null) {
            head=head.next;
            return head;
        }
        while(fast.next!=null){
            fast=fast.next;
            slow=slow.next;
        }
        if(slow.next==fast){
            slow.next=null;
        }
        else {
            ListNode temp=slow.next;
            slow.next=temp.next;
        }
        return head;
    }
}
