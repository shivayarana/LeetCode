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
    if(head == null) return null;
    return swap(head,head.next);
    }
    private ListNode swap(ListNode prev,ListNode cur){
        if(prev != null && cur  != null){
            prev.next = cur.next;
            cur.next = prev;
            if(prev.next != null )
                  prev.next = swap(prev.next,prev.next.next);
            return cur;
        }else{
            return prev;
        }
    }
}