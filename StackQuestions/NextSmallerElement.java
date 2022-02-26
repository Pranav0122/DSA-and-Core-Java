package StackQuestions;

import java.util.Stack;

public class NextSmallerElement {
    public static void main(String[] args) {
        Stack<Integer> st=new Stack<>();
        int[] arr={7,1,2,1,3,0};
        int[] nse=new int[arr.length];
        st.push(0);
        for (int curr=0;curr<arr.length;curr++){
            while(!st.isEmpty() && arr[st.peek()]>arr[curr]){
                nse[st.pop()]=arr[curr];
            }
            st.push(curr);
        }
        while (!st.isEmpty()){
            nse[st.pop()]=-1;
        }
        for (int ns:nse)
            System.out.print(ns+" ");
    }
}
