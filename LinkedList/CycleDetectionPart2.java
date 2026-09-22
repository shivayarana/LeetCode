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
    public ListNode detectCycle(ListNode head) {

     if(head == null || head.next == null)
              return null;
        // step 1: find cycle
        ListNode slow = head;
        ListNode fast = head;
        ListNode temp = null;


        //  floyd's cycle detection algorithm
        while(fast != null && fast.next != null){

            slow = slow.next;
            fast = fast.next.next;
            if(slow  == fast){
               slow = head;
              while(slow != fast){
                   slow = slow.next;
                   fast = fast.next;

               } 
               temp = slow;
               break;    
            }
        } 
      return temp;
    }
}
