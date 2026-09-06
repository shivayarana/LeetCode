/**
 * Definition for singly-linked list.
 * class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) {
 *         val = x;
 *         next = null;
 *     }
 * }
 */
public class Solution {
    public boolean hasCycle(ListNode head) {

        // checking bound cases
        if (head == null || head.next == null) {
            return false;
        }

        // defining slow and fast pointers
        slow = head;
        fast = head.next;

        //    performing operation
        while (fast != null && fast.next != null) {
            if (fast == slow) {
                return true;
            } else {
                slow = slow.next;
                fast = fast.next.next;
            }
        }
        return false;
    }
}
