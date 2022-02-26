package StackQuestions;

import java.util.Arrays;
import java.util.Stack;

public class StockSpanStack {
    public static void main(String[] args) {
        Stack<Integer> st=new Stack<>();
        int[] ht={1,2,4,5,3};
        int[] span=new int[ht.length];
        Arrays.fill(span,1);
        st.push(0);
        for (int curr=1;curr<ht.length;curr++){
            while(!st.isEmpty() && ht[st.peek()]<ht[curr]){
                st.pop();
            }
            span[curr]=st.isEmpty()?curr+1:curr-st.peek();
            st.push(curr);
        }

        for(int sp:span){
            System.out.print(sp+" ");
        }
    }
}
