package Queue;
import java.util.LinkedList;
import java.util.Queue;
public class JavaQueue {
    public static void main(String[] args) {
        Queue<Integer> q=new LinkedList<>();
        System.out.println(q);
        q.add(10);
        q.add(20);
        q.add(30);
        System.out.println(q.remove());
        System.out.println(q);
        System.out.println(q.isEmpty());
        System.out.println(q.size());
        System.out.println(q.poll());
    }
}
