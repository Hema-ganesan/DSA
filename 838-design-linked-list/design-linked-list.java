class MyLinkedList {
    class Node {
    int val;
    Node next;

    Node(int val) {
        this.val = val;
    }
}
    private Node head;
    private int size;

    public MyLinkedList() {
        head=null;
        size=0;
    }
    
    public int get(int index) {
        if(index<0 ||index>=size){
            return -1;
        }
        Node temp=head;
        for(int i=0;i<index;i++){
            temp=temp.next;
        }
        return temp.val;
    }
    
    public void addAtHead(int val) {
        Node nnode=new Node(val);
        nnode.next=head;
        head=nnode;
        size++;
    }
    
    public void addAtTail(int val) {
        Node nnode=new Node(val);
        if(head==null){
            head=nnode;
        }
        else{
            Node temp=head;
            while(temp.next!=null){
                temp=temp.next;
            }
            temp.next=nnode;
        }
        size++;
    }
    
    public void addAtIndex(int index, int val) {
        if(index<0 ||index>size){
            return;
        }
        if(index==0){
            addAtHead(val);
            return;
        }
        if(index==size){
            addAtTail(val);
            return;
        }
        Node prev=head;
        for(int i=0;i<index-1;i++){
            prev=prev.next;
        }
        Node nnode=new Node(val);
        nnode.next=prev.next;
        prev.next=nnode;
        size++;
    }
    
    public void deleteAtIndex(int index) {
        if(index<0 ||index>=size){
            return;
        }
        if(index==0){
            head=head.next;
            size--;
            return;
        }
        Node prev=head;
        for(int i=0;i<index-1;i++){
            prev=prev.next;
        }
        prev.next=prev.next.next;
        size--;
    }
}

/**
 * Your MyLinkedList object will be instantiated and called as such:
 * MyLinkedList obj = new MyLinkedList();
 * int param_1 = obj.get(index);
 * obj.addAtHead(val);
 * obj.addAtTail(val);
 * obj.addAtIndex(index,val);
 * obj.deleteAtIndex(index);
 */