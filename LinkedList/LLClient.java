package LinkedList;

 public class LLClient {
    public static void main(String[] args) throws Exception{
        LinkedList ll=new LinkedList();
//        LinkedList.Node nn=new LinkedList.Node(10);
        ll.addAtFirst(10);
        ll.addAtFirst(20);
        ll.addAtFirst(30);
        ll.addAtIndex(40,2);
        ll.addAtLast(50);
        ll.display();
        System.out.println(ll.midPointValue());
        System.out.println(ll.midPointNode());
//        System.out.println(ll.deleteFirst());
//        System.out.println(ll.deleteLast());
//        System.out.println(ll.deleteAtIndex(3));
//        ll.reverseActual();
//        ll.display();
//        ll.reverseActual();
//        ll.display();
//
//        System.out.println(ll.getFirst());
//        System.out.println(ll.getLast());
//        System.out.println(ll.size());
//        System.out.println(ll.getAtIndex(3));
    }
}
