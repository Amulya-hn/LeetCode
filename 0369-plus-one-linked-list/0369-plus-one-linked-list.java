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
    public ListNode plusOne(ListNode head) {
        ListNode trav=head;
        ListNode notNine= new ListNode(0);
        notNine.next=head;
        ListNode res=notNine;
        while(trav!=null)
        {
            if(trav.val!=9)
            {
                notNine=trav;
            }
            trav=trav.next;
        }
        notNine.val++;
        notNine=notNine.next;
        while(notNine!=null)
        {
            notNine.val=0;
            notNine=notNine.next;
        }
        return res.val==1 ? res:res.next;
    }
}