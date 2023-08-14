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
    public ListNode swapPairs(ListNode head) {
        ListNode dummy=new ListNode();
        dummy.next=head;
        ListNode prev=dummy;
        while(head!=null && head.next!=null)
        {
            ListNode firstNode=head;
            ListNode secNode=head.next;
            
            firstNode.next=secNode.next;
            prev.next=secNode;
            secNode.next=firstNode;
            
            prev=firstNode;
            head=firstNode.next;
        }
        return dummy.next;
    }
}