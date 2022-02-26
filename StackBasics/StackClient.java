package StackBasics;

import java.util.Vector;

public class StackClient {
    public static void main(String[] args) throws Exception{
        Stack st=new Stack();
        System.out.println(st);
        System.out.println(st.size());
        System.out.println(st.isEmpty());
        st.push(10);
        System.out.println(st.size());
        System.out.println(st.isEmpty());
        st.push(20);
        st.push(30);
        st.push(40);
        st.display();
        System.out.println(st.size());
        System.out.println(st.isEmpty());
        System.out.println(st.pop());
        System.out.println(st.peek());
        st.display();
    }
}
