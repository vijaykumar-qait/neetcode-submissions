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
        ListNode slowPtr = head;
        ListNode fastPtr = head;
        Stack<ListNode> stack = new Stack<>();

        while ( fastPtr != null && fastPtr.next != null ) {
            stack.push(slowPtr);
            fastPtr = fastPtr.next.next;
            slowPtr = slowPtr.next;
        }

        if ( fastPtr!= null ) {
            slowPtr = slowPtr.next;
        }

        while ( slowPtr != null ) {
            if ( stack.pop().val != slowPtr.val ) {
                return false;
            }
            slowPtr = slowPtr.next;
        }
        return true;
    }
}