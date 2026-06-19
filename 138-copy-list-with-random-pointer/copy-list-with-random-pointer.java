/*
// Definition for a Node.
class Node {
    int val;
    Node next;
    Node random;

    public Node(int val) {
        this.val = val;
        this.next = null;
        this.random = null;
    }
}
*/

class Solution {
    public Node copyRandomList(Node head) {
		// code here
		Node temp = head;
		Node copynode;
		while (temp != null) {
			copynode = new Node(temp.val);
			copynode.next = temp.next;
			temp.next = copynode;
			temp = temp.next.next;
		}
		temp = head;
		while (temp != null) {
			copynode = temp.next;
			if (temp.random != null) {
				copynode.random = temp.random.next;
			}
			
			temp = temp.next.next;
		}
		Node dummy = new Node(-1);
		Node res = dummy;
		temp = head;
		while (temp != null) {
			res.next = temp.next;
			temp.next = temp.next.next;
			res = res.next;
			temp = temp.next;
		}
		return dummy.next;
	}
}