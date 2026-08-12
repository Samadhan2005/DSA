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
        if(head==null||head.next==null){
            return true;
        }
        //find mid node
        ListNode mid=findmid(head);
        //revere the second half
        ListNode curr=mid;
        ListNode prev=null;
        ListNode next;
        while(curr!=null){
            next=curr.next;
            curr.next=prev;
            prev=curr;
            curr=next;
        }
        //left side ===right side
        ListNode left=head;
        ListNode right=prev;
      
        while(right!=null){
            if(left.val!=right.val){
                return false;
            }
            left=left.next;
            right=right.next;
        }
        return true;
    }
        private ListNode findmid(ListNode head){
            ListNode slow=head;
            ListNode fast=head;

            while(fast!=null && fast.next!=null){
                slow=slow.next;
                fast=fast.next.next;
            }
            return slow;
        }
    
}