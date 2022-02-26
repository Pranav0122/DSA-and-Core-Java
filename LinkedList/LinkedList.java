package LinkedList;

public class LinkedList {
    class Node{
        int value;
        Node next;
        public Node(int val){
            this.value=val;
        }
    }
   private Node head;
    public void addAtFirst(int value){
        Node n=new Node(value);
        n.next=this.head;
        this.head=n;
        n=null;
    }
    public void display(){
        Node i=head;
        while (i!=null){
            System.out.print(i.value+"-> ");
            i=i.next;
        }
        System.out.println();
    }
    public int getFirst() throws Exception{
        if(isEmpty())
            throw new Exception("Linked List khalli hai");
        return head.value;
    }
    public boolean isEmpty(){
        return head==null;
    }
    public int getLast() throws Exception {
        if(isEmpty())
            throw new Exception("Linked List khalli hai");
        Node lastNode=head;
        while (lastNode.next!=null){
            lastNode=lastNode.next;
        }
        return lastNode.value;
    }
    public int size(){
        Node listSize=head;
        int count=0;
        while(listSize!=null){
            listSize=listSize.next;
            count++;
        }
        return count;
    }
   private int getAtIndex(int value) throws Exception {
        if(isEmpty())
            throw new Exception("Linked List khalli hai");
        if(value<0 || value>=size())
            throw new Exception("Galat index hai");
        Node index=head;
        int i=1;
        while(i<=value){
            index=index.next;
            i++;
        }
        return index.value;
    }

    public Node getNodeAtIndex(int index) throws Exception {
        if(isEmpty())
            throw new Exception("Linked List khalli hai");
        if(index<0 || index>=size())
            throw new Exception("Galat index hai");
        Node nidx=head;
        for(int i=1;i<=index;i++){
            nidx=nidx.next;
        }
        return nidx;
    }

    public void addAtLast(int value) throws Exception {
        Node newNode=new Node(value);
        if(isEmpty())
            addAtFirst(value);
        else{
            Node getNode=getNodeAtIndex(size()-1);
            getNode.next=newNode;
        }
    }

    public void addAtIndex(int value,int index) throws Exception {
        if(index<0 || index>size())
            throw new Exception("Galat index hai");
        if(index==0)
            addAtFirst(value);
        else if(index==size())
            addAtLast(value);
        else{
            Node nn=new Node(value);
            Node idx=getNodeAtIndex(index-1);
            Node idxN=getNodeAtIndex(index);
            idx.next=nn;
            nn.next=idxN;
        }
    }
    public int deleteFirst() throws Exception {
        if (this.isEmpty()) {
            throw new Exception("Linked List khalli hai");
        }
        int deletedValue= head.value;
        Node deletedNode=head;
        head=head.next;
        deletedNode=null;
        return deletedValue;
    }

    public int deleteLast() throws Exception {
        if(size()==1)
            return deleteFirst();
        else{
            Node deleteLastNode=getNodeAtIndex(size()-2);
            Node lastNode=deleteLastNode.next;
            deleteLastNode.next=null;
            int temp=lastNode.value;
            lastNode=null;
            return temp;
        }
    }
    public int deleteAtIndex(int index) throws Exception {
        if (this.isEmpty()) {
            throw new Exception("Linked List khalli hai");
        }
        if(index>=size())
            throw new Exception("Galat index hai");
        if(index==0)
            return deleteFirst();
        else{
            Node prevNode=getNodeAtIndex(index-1);
            Node currNode=prevNode.next;
            Node nextNode=prevNode.next.next;
            prevNode.next=nextNode;
            int deletedNodeValue=currNode.value;
            currNode=null;
            return deletedNodeValue;
        }
    }
    public void reverseActual() throws Exception {
        if (this.isEmpty()) {
            throw new Exception("Linked List khalli hai");
        }
        Node prev=null;
        Node curr=head;
        while (curr!=null){
            Node currNext=curr.next;
            curr.next=prev;
            prev=curr;
            curr=currNext;
        }
        head=prev;
    }
    public int midPointValue() throws Exception {
        return midPointNode().value;
    }
    public Node midPointNode() throws Exception {
        if(isEmpty())
            throw new Exception("Linked List khalli hai");
        Node slow_ptr=head;
        Node fast_ptr=head;
        while (fast_ptr!=null && fast_ptr.next!=null){
            slow_ptr=slow_ptr.next;
            fast_ptr=fast_ptr.next.next;
        }
        return slow_ptr;
    }

    public static void main(String[] args) {

    }
}
