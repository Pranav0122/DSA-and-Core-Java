package StackQuestions;

import java.util.Stack;

public class PreviousGreaterElement {
    public static void main(String[] args) {
        Stack<Integer> st=new Stack<>();
        int[] arr={7,1,2,1,3,0};
        int[] pge=new int[arr.length];
        st.push(0);
        pge[0]=-1;
        for(int curr=1;curr<arr.length;curr++){
            while(!st.isEmpty() && arr[st.peek()]<arr[curr]){
                st.pop();
            }
            if(!st.isEmpty())
                pge[curr]=arr[st.peek()];
            else
                pge[curr]=-1;
            st.push(curr);
        }
        for(int pg:pge)
            System.out.print(pg+" ");
    }
}
