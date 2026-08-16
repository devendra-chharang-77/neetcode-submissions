class Solution {
    public boolean hasCycle(ListNode head) {
        ListNode slow = head;
        ListNode fast = head;
        
        while (fast != null && fast.next != null) {
            slow = slow.next;        // 1 step
            fast = fast.next.next;   // 2 steps
            
            if (slow == fast) {
                return true;  // dono mil gaye → cycle hai
            }
        }
        
        return false;  // fast null tak pahunch gaya → koi cycle nahi
    }
}