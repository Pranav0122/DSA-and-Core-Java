package StackQuestions;

import java.util.Stack;

public class PreviousSmallerElement {
    public static void main(String[] args) {
        Stack<Integer> st=new Stack<>();
        int[] arr={7,1,2,1,3,8};
        int[] pse=new int[arr.length];
        pse[0]=-1;
        st.push(0);
        for(int curr=1;curr<arr.length;curr++){
            while (!st.isEmpty() && arr[st.peek()]>=arr[curr]){
                st.pop();
            }
            if(!st.isEmpty())
                pse[curr]=arr[st.peek()];
            else
                pse[curr]=-1;
            st.push(curr);
        }
        for(int ps:pse)
            System.out.print(ps+" ");
    }
}
