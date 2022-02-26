package StackQuestions;

import java.util.Arrays;
import java.util.Stack;

public class NextGreaterElement {
    public static void main(String[] args) {
        Stack<Integer> st=new Stack<>();
        int arr[]={7,1,2,1,3,5};
        int[] nge=new int[arr.length];
      //  Arrays.fill(nge,-1);
        st.push(0);
        for(int curr=1;curr<arr.length;curr++){
            while(!st.isEmpty() && arr[st.peek()]<arr[curr]){
                nge[st.peek()]=arr[curr];
                st.pop();
            }
            st.push(curr);
        }
        while(!st.isEmpty()){
            nge[st.pop()]=-1;
        }
        for(int ng:nge){
            System.out.print(ng+" ");
        }
    }
}
