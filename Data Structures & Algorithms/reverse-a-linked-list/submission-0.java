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
    public ListNode reverseList(ListNode head) {
        if ( head == null ) {
            return null;
        }
        ListNode currentPtr = head;
        ListNode prevPtr = null;

        while ( currentPtr != null ) {
            ListNode nextPtr = currentPtr.next;
            currentPtr.next = prevPtr;
            prevPtr = currentPtr;
            currentPtr = nextPtr;
        }
        return prevPtr;
    }
}
