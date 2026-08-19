/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) {
 *         val = x;
 *         next = null;
 *     }
 * }
 */
public class Solution {
    public ListNode getIntersectionNode(ListNode headA, ListNode headB) {
        Set<ListNode> set = new HashSet<>();
        ListNode headAPtr = headA;
        while ( headAPtr != null ) {
            set.add(headAPtr);
            headAPtr = headAPtr.next;
        }
        ListNode headBPtr = headB;
        while ( headBPtr != null )  {
            if ( set.contains(headBPtr) ) {
                return headBPtr;
            }
            headBPtr = headBPtr.next;
        }
        return null;
    }
}