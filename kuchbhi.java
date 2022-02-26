import java.util.*;

public class kuchbhi {
//    public void def(){
//        System.out.println(get());
//        abs();
//        get();
//    }
//    public static void abs(){
//        System.out.println("inside abs");
//    }
//    public int get(){
//        System.out.println("inside get");
//        return 10;
//    }
    interface MyInterface{
    public int num = 30;
    public void demo();
}
    static class InterfaceExample implements MyInterface {
        String name;
        String email;
        public void demo() {
            System.out.println("This is the implementation of the demo method");
        }
        public void start(){
            System.out.println("Start");
        }
    }
    public static void main(String[] args) {
//        kuchbhi kb=new kuchbhi();
//        Deque<InterfaceExample> dq=new ArrayDeque<>();
//        Queue<Integer> qu=new LinkedList<>();
//        qu.add(10);
//        LinkedList<Integer> ls=new LinkedList<>();
//        ls.addFirst(10);
//        List<Integer> ls=new ArrayList<>();
//        Iterator<Integer> it=new dq.iterator();
//        kb.def();
       MyInterface obj = new InterfaceExample();
        obj.demo();
        StringBuilder st=new StringBuilder();
        StringBuilder st1=new StringBuilder();
        st1.append("Pran");
        st.append("Pran");
//        int[] arr={1,2,3};
//        String[] str={"abs","bsc"};
//        System.out.println(str);
//        System.out.println(arr);
        System.out.println(20+30+"My");
        int i=9;
        float v=i*0.1f/10;
        System.out.println(i);
        System.out.println(v);
//        System.out.println(st.compareTo(st1));
//        System.out.println(st);
//        String s=st.toString();
//        System.out.println(s);
//        System.out.println(MyInterface.num);
    }
}
