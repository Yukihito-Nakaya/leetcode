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
    public boolean isPalindrome(ListNode head) {
        ListNode check = null;
        while(head != null){
            ListNode temp = new ListNode(head.val);
            temp.next = check;
            check = temp;
            head = head.next;
        }
        return check == head;
    }
}