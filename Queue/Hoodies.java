package Queue;

import java.util.*;

public class Hoodies {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        List<Queue<Integer>> ql=new ArrayList<>();
        Queue<Integer> order=new LinkedList<>();
        for(int i=0;i<=4;i++){
            ql.add(new LinkedList<>());
        }
        System.out.println(ql);
        int q= sc.nextInt();
        while (q--!=0){
            char ch=sc.next().charAt(0);
            if(ch=='E'){
                int courseN=sc.nextInt();
                int rollN=sc.nextInt();
                Queue<Integer> qu=ql.get(courseN);
                qu.add(rollN);
                if(!order.contains(qu)){
                    order.add(courseN);
                }
            }
            else{
                int queNumber=order.peek();
                Queue<Integer> qu=ql.get(queNumber);
                System.out.println(queNumber+" "+qu.remove());
                if(qu.isEmpty()){
                    order.remove();
                }
            }
        }
    }
}
