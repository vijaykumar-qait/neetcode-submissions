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
        ListNode headAPtr = headA;
        ListNode headBPtr = headB;

        int sizeA = 0;
        int sizeB = 0;

        while ( headAPtr != null ) {
            headAPtr = headAPtr.next;
            sizeA++;
        }

        while ( headBPtr != null ) {
            headBPtr = headBPtr.next;
            sizeB++;
        }

        headAPtr = headA;
        headBPtr = headB;

        if ( sizeA > sizeB ) {
            int times = sizeA - sizeB;
            while ( times > 0 ) {
                headAPtr = headAPtr.next;
                times--;
            }
        }
        else {
            int times = sizeB - sizeA;
            while ( times > 0 ) {
                headBPtr = headBPtr.next;
                times--;
            }
        }

        while ( headAPtr != null && headBPtr!= null) {
            if (headAPtr == headBPtr ) {
                return headAPtr;
            }
            headAPtr = headAPtr.next;
            headBPtr = headBPtr.next;
        }
        return null;
    }
}