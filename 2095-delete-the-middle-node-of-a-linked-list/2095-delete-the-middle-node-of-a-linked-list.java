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
    public ListNode deleteMiddle(ListNode head) {
       int size=0;
       ListNode temp=head;
       while(temp!=null){
        temp=temp.next;
        size++;
       }
       if(size==1){
        return null;
       }
       int i=0;
       int j=size/2;
      ListNode prev=head;
      while(i<j-1){
            prev=prev.next;
            i++;
      }
      prev.next=prev.next.next;
      return head;
    }
}