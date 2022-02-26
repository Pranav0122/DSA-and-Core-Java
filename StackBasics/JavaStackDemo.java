package StackBasics;

import java.util.Stack;

public class JavaStackDemo {
    public static void main(String[] args) {
        Stack<Integer> st=new Stack<>();
        if(!st.isEmpty()){
            System.out.println(st.pop());
        }
        System.out.println(st);

        st.push(10);
        st.push(20);
        st.push(30);

        System.out.println(st);

       int poppedValue=  st.pop();//to remove topmost element and return it

        System.out.println(poppedValue);
        System.out.println(st);

        System.out.println(st.isEmpty());

        int peekedValue=st.peek();//It will return the value of topmost element in stack without removing it
        System.out.println(peekedValue);
    }
}
