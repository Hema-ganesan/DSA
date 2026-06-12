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
    public ListNode rotateRight(ListNode head, int k) {
        if(head==null || k==0){
            return head;
        }
        int len=1;
        ListNode tail=head;
        while(tail.next!=null){
            tail=tail.next;
            len++;
        }
        
       
        
        
        if(k%len==0){
            return head;
        }
        k=k%len;
        if(k == 0){
            return head;
        }

      tail.next = head;
        
        ListNode newnode=nnode(head,len-k);
        head=newnode.next;
        newnode.next=null;
        return head;
    }
    public ListNode nnode(ListNode head,int k){
        ListNode temp=head;
        k--;
        while(temp!=null && k>0){
            temp=temp.next;
            k--;
        }
        return temp;
    }
}