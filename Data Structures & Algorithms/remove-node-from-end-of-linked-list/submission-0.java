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
         int length = 0;
         ListNode current = head;
         while(current!=null){
         length++;
         current = current.next;

         }
         int positionNode = length-n;
ListNode dummy = new ListNode(0);
dummy.next = head;
current = dummy;
for(int i=0;i<positionNode;i++){
    current = current.next;
}
current.next = current.next.next;
    
    return dummy.next;
}
}
