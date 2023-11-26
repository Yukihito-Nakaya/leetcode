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
       HashMap<ListNode, Boolean> map = new HashMap<>();
       while(head != null){
           if(map.containsKey(head)){
               return true;
           }
           map.put(head,true);
           head = head.next;
       }
       return false;
    }
}

//another solution
// public class Solution {
//     public boolean hasCycle(ListNode head) {
//         ListNode sh = head;
//         ListNode fh = head;
//         while (fh != null && fh.next != null) {
//             sh = sh.next;
//             fh = fh.next.next;
//             if (sh == fh) return true;
//         }
//         return false;
//     }
// }