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
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        ListNode dummy = new ListNode();
        ListNode cur = dummy;
        int carry = 0;
        while(l1 != null && l2 !=  null){
            cur.next = new ListNode();
            int sum = l1.val + l2.val + carry;
            cur.next.val = sum % 10;
            carry = sum / 10;
            l1 = l1.next;
            l2 = l2.next;
            cur = cur.next;
        }
        
        if(l1 != null){
            while(l1 != null){
                cur.next = new ListNode();
                int sum = l1.val + carry;
                cur.next.val = sum % 10;
                carry = sum / 10;
                cur = cur.next;
                l1 = l1.next;
            }
        }else{
            
            while(l2 != null){
                cur.next = new ListNode();
                int sum = l2.val + carry;
                cur.next.val = sum % 10;
                carry = sum / 10;
                cur = cur.next;
                l2 = l2.next;
            }
        }
        if(carry != 0){
            cur.next = new ListNode(carry);
        }
        return dummy.next;
        
    }
}
