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
    public void reorderList(ListNode head) {
        //find the mid
        ListNode slow=head;
        ListNode fast=head.next;
        while(fast!=null&&fast.next!=null){
            slow=slow.next;
            fast=fast.next.next;
        }
        ListNode mid=slow;
        //reverse 2ND half
         ListNode curr=mid.next;
         mid.next=null;
         ListNode prev=null;
         ListNode next;
         while(curr!=null){
            next=curr.next;
            curr.next=prev;
            prev=curr;
            curr=next;
         }
      ListNode lefth=head;
      ListNode righth=prev;
      ListNode nextL,nextR;

      while(lefth!=null&&righth!=null){
        nextL=lefth.next;
        lefth.next=righth;
        nextR=righth.next;
        righth.next=nextL;

        righth=nextR;
        lefth=nextL;
      }
        return;
    }
}