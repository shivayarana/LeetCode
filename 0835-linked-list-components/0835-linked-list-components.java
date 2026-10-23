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
    public int numComponents(ListNode head, int[] nums) {
       Set<Integer> set = new HashSet<>();
       for(int i = 0; i < nums.length; i++){
           set.add(nums[i]);
       } 
       
       int count = 0;
       boolean isComp = false;
       while(head != null){
           if(!set.contains(head.val) && isComp){
               count++;
               isComp = false;
          
           }
           if(set.contains(head.val))
                isComp = true;
           head = head.next;
       }
        if(isComp) count++;
        return count;
    }
}