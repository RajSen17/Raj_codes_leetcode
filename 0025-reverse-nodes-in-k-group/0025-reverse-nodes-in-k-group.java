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
    public ListNode reverseKGroup(ListNode head, int k) {
        // Edge case: if list is empty or k == 1 → no change
        if (head == null || k == 1) return head;

        // Dummy node → helps handle head reversals cleanly
        ListNode dummy = new ListNode(0, head);

        // Pointers for traversal
        ListNode leftPre = dummy; // Node before the current group
        ListNode temp = head;     // Current node iterator

        while (true) {
            // Step 1: Check if k nodes exist from 'temp'
            ListNode check = temp;
            for (int i = 0; i < k; i++) {
                if (check == null) return dummy.next; // Less than k nodes left → done
                check = check.next;
            }

            // Step 2: Reverse k nodes
            ListNode subHead = temp; // Start node of the group (will become tail after reversal)
            ListNode prev = null;
            ListNode curr = temp;
            ListNode next = null;

            for (int i = 0; i < k; i++) {
                next = curr.next;   // Save next node
                curr.next = prev;   // Reverse link
                prev = curr;        // Move prev forward
                curr = next;        // Move curr forward
            }

            // Step 3: Reconnect reversed part with previous and next groups
            leftPre.next = prev;    // Connect previous part to new head of this group
            subHead.next = curr;    // Connect tail of reversed group to remaining list

            // Step 4: Move pointers for next iteration
            leftPre = subHead;      // New "previous" becomes the old head
            temp = curr;            // Continue from next group
        }
    }
}
