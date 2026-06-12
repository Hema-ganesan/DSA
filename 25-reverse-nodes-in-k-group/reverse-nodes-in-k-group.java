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
        ListNode temp=head;
        ListNode prevnode=null;
        ListNode nextnode=null;
        while(temp!=null){
            ListNode knode=getknode(temp,k);
                if(knode==null){
                    if(prevnode!=null){
                        prevnode.next=temp;
                        break;
                    }
                }
                nextnode=knode.next;
                knode.next=null;
                reverseList(temp);
                if(temp==head){
                    head=knode;
                }
                else{
                    prevnode.next=knode;
                }
                prevnode=temp;
                temp=nextnode;
            
        }
        return head;
    }
    public ListNode getknode(ListNode temp,int k){
        k--;
        while(temp!=null && k>0){
            
            temp=temp.next;
            k--;
        }
        return temp;
    }
    public ListNode reverseList(ListNode temp) {
        ListNode prev=null;
        ListNode front=null;
        if(temp==null || temp.next==null){
            return temp;
        }
        while(temp!=null){
            front=temp.next;
            temp.next=prev;
            prev=temp;
            temp=front;
        }
        return prev;
    }
}