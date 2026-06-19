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
    public ListNode reverseBetween(ListNode head, int left, int right) {

        if(head == null || left == right) {
            return head;
        }

        while(left < right) {

            ListNode leftNode = head;
            for(int i = 1; i < left; i++) {
                leftNode = leftNode.next;
            }

            ListNode rightNode = head;
            for(int i = 1; i < right; i++) {
                rightNode = rightNode.next;
            }

            int temp = leftNode.val;
            leftNode.val = rightNode.val;
            rightNode.val = temp;

            left++;
            right--;
        }

        return head;
    }
}