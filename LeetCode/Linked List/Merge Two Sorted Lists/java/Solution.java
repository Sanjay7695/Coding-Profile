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
    public ListNode mergeTwoLists(ListNode list1, ListNode list2) {
        // Create a dummy node to serve as the head of the merged list
        ListNode dummy = new ListNode(0);
        // 'curr' pointer tracks the last node of the merged list
        ListNode curr = dummy;

        // Loop as long as both lists have nodes
        while (list1 != null && list2 != null) {
            if (list1.val <= list2.val) {
                curr.next = list1; // Attach the smaller node from list1
                list1 = list1.next; // Advance list1's pointer
            } else {
                curr.next = list2; // Attach the smaller node from list2
                list2 = list2.next; // Advance list2's pointer
            }
            curr = curr.next; // Move the 'curr' pointer forward
        }

        // Attach any remaining nodes from the non-empty list
        if (list1 != null) {
            curr.next = list1;
        } else {
            curr.next = list2;
        }

        // The merged list starts from the next of the dummy node
        return dummy.next;
    }
}
