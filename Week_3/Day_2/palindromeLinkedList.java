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
    public boolean isPalindrome(ListNode head) {
        if(head.next == null) return true;
        ListNode slow = head;
        ListNode fast= head;
        while(fast!=null && fast.next!=null){
            fast=fast.next.next;
            slow=slow.next;
        }
        ListNode prev=null;
        ListNode temp=slow;
        while(temp!=null){
            ListNode next = temp.next;
            temp.next=prev;
            prev=temp;
            temp=next;
        }
        slow=head;
        fast=prev;
        while(fast!=null){
            if(fast.val != slow.val){
                return false;
            }
            fast=fast.next;
            slow = slow.next;
        }
        return true;
    }
}
