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
    public ListNode middleNode(ListNode head) {
        int n = 0;
        ListNode ans = head;
        while(ans != null){
            n++;
            ans = ans.next;
        }
        int mid = n / 2;
        ans = head;
        for(int i = 0; i < mid; i++){
            ans = ans.next;
        }
        return ans;
    }
}