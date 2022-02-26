package StackQuestions;

import java.util.Stack;

public class ValidSubArrays {
    public static void main(String[] args) {
        Stack<Integer> st=new Stack<>();
        int[] arr={1,4,2,5,3};
        int[] nse=new int[arr.length];
        st.push(0);
        for(int curr=1;curr<arr.length;curr++){
            while (!st.isEmpty() && arr[st.peek()]>arr[curr]){
                nse[st.pop()]=curr;
            }
            st.push(curr);
        }
        while (!st.isEmpty()){
            nse[st.pop()]=arr.length;
        }
        int count=0;
        for(int i=0;i<arr.length;i++){
            count+=nse[i]-i;
        }
        System.out.println(count);
    }
}
