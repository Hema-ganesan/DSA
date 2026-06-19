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
    public int[] nextLargerNodes(ListNode head) {
        ListNode temp=head;
        int size=0;
        while(temp!=null){
            size++;
            temp=temp.next;
        }
        int[] ans=new int[size];
        if(head==null || head.next==null){
            return ans;
        }
        int i=0;
        temp=head;
        while(temp!=null){
            ListNode next=temp.next;
            while(next!=null){
                if(next.val>temp.val){
                   ans[i]=next.val;
                   break;
            }
            next=next.next;
            }
            i++;
            temp=temp.next;
        }
        return ans;
    }
}