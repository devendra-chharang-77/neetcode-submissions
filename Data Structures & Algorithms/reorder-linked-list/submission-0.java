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
        if(head == null) return;
      List<ListNode> node= new ArrayList<>();
      ListNode current = head;
      while(current!=null){
        node.add(current);
        current = current.next;
      }
      int left = 0,right = node.size()-1;
      while(left<right){
        node.get(left).next = node.get(right);
        left++;
        if(left == right) break;
        node.get(right).next = node.get(left);
        right--;
      }
      node.get(left).next = null;
    }
}
