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
    public ListNode deleteDuplicates(ListNode head) {
        if(head == null)return head;
        ListNode tent = head;
        while(tent.next != null){
            if(tent.val != tent.next.val){
                tent = tent.next;
            } else {
                tent.next = tent.next.next;
            }
        }
        return head;
    }
}