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
    public ListNode oddEvenList(ListNode head) {
        if(head == null || head.next == null)
             return head;
        
         ListNode evenhead = head.next;
         
         ListNode oddCur = head;
         ListNode evenCur = evenhead;
         
         ListNode cur = evenhead.next;
         int index = 3;
         while(cur != null){
             if(index % 2 == 0){
                 evenCur.next = cur;
                 evenCur = cur;
             }else{
                 oddCur.next = cur;
                 oddCur = cur;
             }
             index++;
             cur = cur.next;
             evenCur.next = null;
         }
         oddCur.next = evenhead;
         return head;
         
         
    }
}
