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
    public ListNode reverseKGroup(ListNode head, int k) {
            ListNode cur = head;
    int size = 0;
    while(cur != null && cur.next != null){
        cur = cur.next.next;
        size += 2;
    }
    if(cur != null) size++;
    cur = head;

    int cycles = size / k;
    ListNode tail = null;
    for(int i = 0 ; i  < cycles; i++){
    ListNode h = cur;
    ListNode t = null;
    for(int j = 0; j < k; j++){
      ListNode temp = cur;
      cur = cur.next;
      temp.next = t;
      t = temp;
    }
    if(i == 0) head = t;
    if(tail == null) tail=h;
    else tail.next = t;
    tail = h;


    }
    tail.next = cur;

     return head;   
    }
  
}