package Queue;

public class QueueClient {
    public static void main(String[] args) throws Exception {
        QueueUsingArrays q=new QueueUsingArrays();
        q.enQueue(10);
        q.enQueue(20);
        q.enQueue(30);
        System.out.println(q.deQueue());
        q.enQueue(40);
        q.enQueue(50);
        System.out.println(q.deQueue());
        q.enQueue(60);
        q.enQueue(70);

        q.display();
        System.out.println(q.getFront());
    }
}
